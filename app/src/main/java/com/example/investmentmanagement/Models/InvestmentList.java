package com.example.investmentmanagement.Models;

import java.util.ArrayList;

public class InvestmentList implements IInvestmentList{

    private ArrayList<Investment> investments;

    @Override
    public void addInvestment(Investment investment) {
        investments.add(investment);
    }

    @Override
    public ArrayList<Investment> getAllInvestment() {
        ArrayList<Investment> temp = new ArrayList<>();
        for (int i = 0; i<investments.size();i++ ){
            temp.add(getInvestment(i));
        }
        return temp;
    }

    @Override
    public Investment getInvestment(int id) {
        return investments.get(id);
    }

    @Override
    public void deleteInvestment(Investment investment) {
        investments.remove(investment);
    }
    @Override
    public void deleteInvestmentById(int id) {
        investments.remove(id);
    }

}
