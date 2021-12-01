package com.example.investmentmanagement.Views;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.investmentmanagement.Models.User;
import com.example.investmentmanagement.R;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity{
    TextView textView,textView2,textView3,textView4;
    EditText editTextTextEmailAddress,editTextTextPassword;
    Button button,button2;

    private User user;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4= (TextView) findViewById(R.id.textView4);

        editTextTextEmailAddress =(EditText) findViewById(R.id.editTextTextEmailAddress);
        editTextTextPassword =(EditText) findViewById(R.id.editTextTextPassword);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent(getApplicationContext(), Sign_upActivity.class);
            startActivity(intent);

            }
        });

        button.setOnClickListener(view -> {
            String email = editTextTextEmailAddress.getText().toString().trim();
            String password = editTextTextPassword.getText().toString().trim();

            if (email.isEmpty()) {
                editTextTextEmailAddress.setError("Email is required!");
                editTextTextEmailAddress.requestFocus();
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                editTextTextEmailAddress.setError("Please enter a valid email!");
                editTextTextEmailAddress.requestFocus();
                return;
            }

            if (password.isEmpty()) {
                editTextTextPassword.setError("Password is required!");
                editTextTextPassword.requestFocus();
                return;
            }

            if (password.length() < 6) {
                editTextTextPassword.setError("Min pass is 6 char");
                editTextTextPassword.requestFocus();
                return;
            }
            else {
                user = new User();
                user.setEmail(email);
                user.setPassword(password);
                validateLogin(user);
            }
        });
    }

    private void validateLogin(User user) {
        mAuth = FirebaseConfig.getFirebaseAuth();
        mAuth.signInWithEmailAndPassword(
                user.getEmail(),
                user.getPassword()
        ).addOnCompleteListener(task -> {

            if ( task.isSuccessful() ) {
                startActivity(new Intent(getApplicationContext(), MainPage.class));
                finish();
            } else {
                Toast.makeText(MainActivity.this,
                        "Error when trying to login", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

