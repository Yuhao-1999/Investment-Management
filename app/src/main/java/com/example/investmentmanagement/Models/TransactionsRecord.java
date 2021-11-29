package com.example.investmentmanagement.Models;

import java.util.Date;

public class TransactionsRecord  extends InvestmentList {

    private boolean Current;
            private Date date;


    public TransactionsRecord(boolean current, Date date) {
        Current = current;
        this.date = date;
    }

    public boolean isCurrent() {
        return Current;
    }

    public void setCurrent(boolean current) {
        Current = current;
    }


    public void setDate(Date date) {
        this.date = date;
    }
}
