package com.example.investmentmanagement.Views;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.investmentmanagement.Models.User;

import androidx.appcompat.app.AppCompatActivity;

import com.example.investmentmanagement.R;
import com.google.firebase.auth.FirebaseAuth;

public class Sign_upActivity extends AppCompatActivity{
    TextView enter_email,enter_username,enter_password,initial_budget;
    EditText editEmail,editUsername,editPassword,editNumber;
    Button sign_upButton,log_inButton;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        enter_email= (TextView) findViewById(R.id.enter_email);
        enter_username= (TextView) findViewById(R.id.enter_username);
        enter_password = (TextView) findViewById(R.id.enter_password);
        initial_budget = (TextView) findViewById(R.id.initial_budget);

        editEmail = (EditText) findViewById(R.id.editEmailAddress);
        editUsername = (EditText) findViewById(R.id.editUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        editNumber = (EditText) findViewById(R.id.editNumber);

        sign_upButton  = (Button) findViewById(R.id.sign_upButton);
        log_inButton = (Button) findViewById(R.id.log_inButton);

        log_inButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Sign_upActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        sign_upButton.setOnClickListener(view -> {
            String email = editEmail.getText().toString().trim();
            String username = editUsername.getText().toString().trim();
            String password = editPassword.getText().toString().trim();
            String initialBudget = editNumber.getText().toString().trim();


            if (username.isEmpty()) {
                editUsername.setError("Username is required");
                editUsername.requestFocus();
                return;
            }
            if (password.isEmpty()) {
                editPassword.setError("Password is required");
                editPassword.requestFocus();
                return;
            }
            if (initialBudget.isEmpty()) {
                editNumber.setError("Initial Budget is required");
                editNumber.requestFocus();
                return;
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                editEmail.setError("Please provide a valid email");
                editEmail.requestFocus();
                return;
            }
            if (email.isEmpty()) {
                editEmail.setError("Email is required");
                editEmail.requestFocus();
                return;
            }
            else {
                User user = new User();
                user.setUserName(username);
                user.setEmail(email);
                user.setPassword(password);
                register(user);
            }
        });
    }

    private void register(User user) {
        String email = editEmail.getText().toString().trim();
        String password = editPassword.getText().toString().trim();
        mAuth = FirebaseConfig.getFirebaseAuth();
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(
                this,
                task -> {

                    if ( task.isSuccessful() ) {
                        Toast.makeText(Sign_upActivity.this,
                                "Account created successfully!",
                                Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();

                    } else {

                        Toast.makeText(Sign_upActivity.this, "Error!",
                                Toast.LENGTH_SHORT).show();
                    }
                });
    }

}






