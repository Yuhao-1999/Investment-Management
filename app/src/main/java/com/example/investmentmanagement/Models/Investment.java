package com.example.investmentmanagement.Models;

public class Investment {
        private String title;
        private String description;
        private int budget;
        private int periodOfReturn;
        private int investmentID;
        private int price;
        private String category;
        private Company company;
        private boolean isRecommended;
        private boolean isActive;


    public Investment(String title, String description, int budget, int periodOfReturn, int investmentID, int price, String category, Company company) {
        this.title = title;
        this.description = description;
        this.budget = budget;
        this.periodOfReturn = periodOfReturn;
        this.investmentID = investmentID;
        this.price = price;
        this.category = category;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getPeriodOfReturn() {
        return periodOfReturn;
    }

    public void setPeriodOfReturn(int periodOfReturn) {
        this.periodOfReturn = periodOfReturn;
    }

    public int getInvestmentID() {
        return investmentID;
    }

    public void setInvestmentID(int investmentID) {
        this.investmentID = investmentID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public boolean isRecommended() {
        return isRecommended;
    }

    public void setRecommended(boolean recommended) {
        isRecommended = recommended;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
