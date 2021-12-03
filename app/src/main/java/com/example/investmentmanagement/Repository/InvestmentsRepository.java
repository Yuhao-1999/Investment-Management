package com.example.investmentmanagement.Repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.investmentmanagement.Models.Investment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvestmentsRepository {

    private static InvestmentsRepository instance;
    private final List<Investment> investmentList;
    private MutableLiveData<List<Investment>> itemsToShow;

    private InvestmentsRepository() {
        investmentList = new ArrayList<>();
        investmentList.add(new Investment("20% returns after 2 years",
                "With just an investment of 5,000 DKK in our mutual funds get a return of 20% after 2 years.\n" +
                        "A mutual fund is a company that pools money from many investors and invests the money in securities such as stocks, bonds, and short-term debt. ... Investors buy shares in mutual funds. Each share represents an investor's part ownership in the fund and the income it generates.",
                "1000",
                "90",
                "1",
                "50",
                "Mutual funds",
                "Family Funds Investment",true,true));
        investmentList.add(new Investment("10 stocks of Tesla for 100DKK",
                "\n" +
                        "With the rising value of stocks of tesla, the company hereby announces the offer to buy 10 stocks just for 100 DKK.\n" +
                        "Stock means a share in the ownership of a company." +
                        " An example of stock is 100 shares of Disney Corporation. ... \n"+ "Stock is defined as to keep a supply of or to provide with something. An example of stock is buying and storing a large amount of toilet paper.",
                "5000",
                "100",
                "2",
                "100",
                "Stocks",
                "Nasdaq",true,true));
        investmentList.add(new Investment("Villa at beautiful city of Copenhagen ",
                "Inside the beautiful city of Copenhagen, grab an opportunity to buy a villa with an area of 400 meter square just at 2million kroner.\n" +
                        "Property is also considered as a growth investment because the price of houses and other properties can rise substantially over a medium to long term period.\n" +
                        "\n" +
                        "However, just like shares, property can also fall in value and carries the risk of losses.\n" +
                        "\n" +
                        "It is possible to invest directly by buying a property but also indirectly, through a property investment fund.",
                "100000",
                "365",
                "3",
                "10000",
                "Movable and Immovable property",
                "Landmark Realty Group",true,true));
        investmentList.add(new Investment("30% returns of share within a year",
                "With the rising value of Apple share you can get 30% returns within a year. Investment starts from 5000DKK\n" +
                        "Shares are considered a growth investment as they can help grow the value of your original investment over the medium to long term.\n" +

                        "If you own shares, you may also receive income from dividends, which are effectively a portion of a company’s profit paid out to its shareholders.\n" +
                        "\n" +
                        "Of course, the value of shares may also fall below the price you pay for them. Prices can be volatile from day to day and shares are generally best suited to long term investors, who are comfortable withstanding these ups and downs.",
                "1000",
                "200",
                "4",
                "100",
                "Growth stocks",
                "A.V. cotex",true,true));
        investmentList.add(new Investment("Offer of 10% fixed interest rate",
                "UK bank announces an offer of 10% fixed interest rate for 6 months. After 6 months the interest rate drops to 8%\n" +
                        "The best known type of fixed interest investments are bonds, which are essentially when governments or companies borrow money from investors and pay them a rate of interest in return.\n" +
                        "\n" +
                        "Bonds are also considered as a defensive investment, because they generally offer lower potential returns and lower levels of risk than shares or property.\n" +
                        "\n" +
                        "They can also be sold relatively quickly, like cash, although it’s important to note that they are not without the risk of capital losses.",
                "10000",
                "1500",
                "5",
                "100000",
                "Cooperative bonds and government bonds.",
                "ICICI Home Finance Ltd FD",true,true));
        itemsToShow = new MutableLiveData<>();
        itemsToShow.setValue(investmentList);

    }

    public static synchronized InvestmentsRepository getInstance(){
        if (instance == null){
            instance = new InvestmentsRepository();
        }
        return instance;
    }

    public List<Investment> getInvestmentList(){
        return investmentList;
    }

//    public LiveData<List<Investment>> getAllItems() {
//        ArrayList<Investment> allInvestments = new ArrayList<>();
//        allInvestments.addAll(investmentList);
//        itemsToShow.setValue(allInvestments);
//        return itemsToShow;
//    }

//    public LiveData<List<Investment>> getRecommendedItems() {
//        ArrayList<Investment> recommendedInvestments = new ArrayList<>();
//
//        for (int i = 0; i < investmentList.size();i++){
//            if (investmentList.get(i).isRecommended()){
//                recommendedInvestments.add(investmentList.get(i));
//            }
//        }
//        itemsToShow.setValue(recommendedInvestments);
//        return itemsToShow;
//    }
//
//    public LiveData<List<Investment>> getActiveItems() {
//        ArrayList<Investment> activeInvestments = new ArrayList<>();
//
//        for (int i = 0; i < investmentList.size();i++){
//            if (investmentList.get(i).isActive()){
//                activeInvestments.add(investmentList.get(i));
//            }
//        }
//        itemsToShow.setValue(activeInvestments);
//        return itemsToShow;
//    }
//    public LiveData<List<Investment>> sortedByPeriod(){
//        ArrayList<Investment> temp = new ArrayList<>();
//        for (int i = 0; i <investmentList.size(); i++) {
//            for (int j = i+1; j <investmentList.size(); j++) {
//                if(investmentList.get(i).getPeriodOfReturn() > investmentList.get(j).getPeriodOfReturn()) {      //swap elements if not in order
//                    temp.set(i,investmentList.get(i));
//                    investmentList.set(i, investmentList.get(j));
//                    investmentList.set(j, temp.get(i));
//                }
//            }
//        }
//        itemsToShow.setValue(investmentList);
//        return itemsToShow;
//    }


    public Investment getItem(int position) {

        return investmentList.get(position);
    }


}
