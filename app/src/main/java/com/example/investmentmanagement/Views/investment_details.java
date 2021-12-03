package com.example.investmentmanagement.Views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.investmentmanagement.Models.Investment;
import com.example.investmentmanagement.R;

import java.util.List;

public class investment_details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.investment_details);

        TextView title,description,budget,period,price,category,company;

        title=findViewById(R.id.title_inv);
        description=findViewById(R.id.description_inv);
        budget=findViewById(R.id.budget_display);
        period=findViewById(R.id.periodOfReturn_display);
        price=findViewById(R.id.price_display);
        category=findViewById(R.id.category_display);
        company=findViewById(R.id.company_display);

        Bundle bundle=getIntent().getExtras();



        title.setText(bundle.getString("1"));
        description.setText(bundle.getString("2"));
        budget.setText(bundle.getString("3"));
        period.setText(bundle.getString("4"));
        price.setText(bundle.getString("5"));
        category.setText(bundle.getString("6"));
        company.setText(bundle.getString("7"));



    }
}
