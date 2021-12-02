package com.example.investmentmanagement;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.investmentmanagement.Models.Investment;

import java.util.List;

public class InvestmentAdapter extends RecyclerView.Adapter<InvestmentAdapter.ViewHolder> {

    List<Investment> investmentList;

    public InvestmentAdapter(List<Investment> investmentList) {
        this.investmentList = investmentList;
    }

    @NonNull
    @Override
    public InvestmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.investment_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InvestmentAdapter.ViewHolder holder, int position) {
        holder.item_title.setText(investmentList.get(position).getTitle());
        holder.description.setText(investmentList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return investmentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item_title;
        TextView description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }
}
