package com.example.investmentmanagement.Models;

import java.util.Date;

public class RecommendedFeed extends InvestmentList{
    private Date date;

    public RecommendedFeed(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
