package com.example.investmentmanagement.Models;

import com.example.investmentmanagement.Views.FirebaseConfig;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String userName;
    private String email;
    private String password;
    private int budget;
    private String id;

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }


}

