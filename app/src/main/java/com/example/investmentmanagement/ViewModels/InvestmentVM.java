package com.example.investmentmanagement.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.investmentmanagement.Models.Investment;
import com.example.investmentmanagement.Repository.InvestmentsRepository;

import java.util.ArrayList;
import java.util.List;

public class InvestmentVM extends ViewModel {
    private InvestmentsRepository repository;

    public InvestmentVM(){
        repository = InvestmentsRepository.getInstance();
    }

    public List<Investment> getInvestmentList(){
        return repository.getInvestmentList();
    }
//    public LiveData<List<Investment>> getAllItems(){
//        return repository.getAllItems();
//    }

//    public LiveData<List<Investment>> getRecommendedItems(){
//        return repository.getRecommendedItems();
//    }
//    public LiveData<List<Investment>> getActive(){
//        return repository.getActiveItems();
//    }
//    public LiveData<List<Investment>> sortedByPeriod(){
//        return repository.sortedByPeriod();
//    }
//
    public Investment getItem(int position){
        return repository.getItem(position);
    }
}
