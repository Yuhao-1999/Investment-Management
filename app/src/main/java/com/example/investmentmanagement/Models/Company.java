package com.example.investmentmanagement.Models;

public class Company {
    private String companyName;
    private int capitalization;

    public Company(String companyName, int capitalization) {
        this.companyName = companyName;
        this.capitalization = capitalization;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCapitalization() {
        return capitalization;
    }

    public void setCapitalization(int capitalization) {
        this.capitalization = capitalization;
    }
}
