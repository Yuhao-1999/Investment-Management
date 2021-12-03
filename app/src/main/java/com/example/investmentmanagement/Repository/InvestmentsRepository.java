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
        investmentList.add(new Investment("Hello", "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum", "5000", "90", "3", "50", "Technology", "DEF", true, true));
        investmentList.add(new Investment("We", "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum", "5000", "90", "3", "50", "Technology", "DEF", true, true));
        investmentList.add(new Investment("Made", "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum", "5000", "90", "3", "50", "Technology", "DEF", true, true));
        investmentList.add(new Investment("It", "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum", "5000", "90", "3", "50","Technology", "DEF", true, true));
        investmentList.add(new Investment("Through", "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum", "5000", "90", "3", "50", "Technology", "DEF", true, true));

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
