package com.example.investmentmanagement.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.investmentmanagement.R;

public class Sign_upActivity extends AppCompatActivity{
    TextView sign_upTitle,enter_email,enter_username,enter_password,initial_budget,already;
    EditText editEmail,editUsername,editPassword,editNumber;
  private   Button sign_upButton,log_inButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        sign_upTitle = (TextView) findViewById(R.id.sign_upTitle);
        enter_email= (TextView) findViewById(R.id.enter_email);
        enter_username= (TextView) findViewById(R.id.enter_username);
        enter_password = (TextView) findViewById(R.id.enter_password);
        initial_budget = (TextView) findViewById(R.id.initial_budget);
        already = (TextView) findViewById(R.id.already);

        editEmail = (EditText) findViewById(R.id.editEmailAddress);
        editUsername = (EditText) findViewById(R.id.editUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        editNumber = (EditText) findViewById(R.id.editNumber);

        sign_upButton  = (Button) findViewById(R.id.sign_upButton);
        log_inButton = (Button) findViewById(R.id.log_inButton);

        log_inButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Sign_upActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}


