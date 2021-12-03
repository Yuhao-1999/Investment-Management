package com.example.investmentmanagement.Models;

public class Investment {
        private String title;
        private String description;
        private String budget;
        private String periodOfReturn;
        private String investmentID;
        private String price;
        private String category;
        private String company;
        private boolean isRecommended;
        private boolean isActive;


    public Investment(String title, String description, String budget, String periodOfReturn, String investmentID, String price, String category, String company) {
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

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getPeriodOfReturn() {
        return periodOfReturn;
    }

    public void setPeriodOfReturn(String periodOfReturn) {
        this.periodOfReturn = periodOfReturn;
    }

    public String getInvestmentID() {
        return investmentID;
    }

    public void setInvestmentID(String investmentID) {
        this.investmentID = investmentID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
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
