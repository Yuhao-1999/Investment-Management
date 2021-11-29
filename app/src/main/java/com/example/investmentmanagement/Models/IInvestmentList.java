package com.example.investmentmanagement.Models;

import java.util.ArrayList;

public interface IInvestmentList {

    void addInvestment(Investment investment);
    ArrayList<Investment> getAllInvestment();
    Investment getInvestment(int id);
    void deleteInvestment(Investment investment);
    public void deleteInvestmentById(int id);

}
