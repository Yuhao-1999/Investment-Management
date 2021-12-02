package com.example.investmentmanagement.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.investmentmanagement.R;

public class MainActivity extends AppCompatActivity{
TextView textView,textView2,textView3,textView4;
EditText editTextTextEmailAddress,editTextTextPassword;
private Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

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
            Intent intent= new Intent(getApplicationContext(),Sign_upActivity.class);
            startActivity(intent);

        }
    });
}
}

