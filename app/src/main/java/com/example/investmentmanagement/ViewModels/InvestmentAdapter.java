package com.example.investmentmanagement.ViewModels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;

import com.example.investmentmanagement.Models.Investment;
import com.example.investmentmanagement.R;

import java.util.ArrayList;
import java.util.List;

public class InvestmentAdapter extends RecyclerView.Adapter<InvestmentAdapter.ViewHolder> {

    private ArrayList<Investment> investmentList;
    private InvestmentVM investmentVM;
    OnListItemClickListener listener;

    public InvestmentAdapter( InvestmentVM investmentVM, int position,OnListItemClickListener listener) {
        this.investmentVM = investmentVM;
        this.listener = listener;
        investmentList = (ArrayList<Investment>) investmentVM.getInvestmentList();

    }

    @NonNull
    @Override
    public InvestmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.investment_item
                ,parent,false);
        return new InvestmentAdapter.ViewHolder(view);
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



     class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView item_title;
        TextView description;
        Button more;

        public TextView getItem_title() {
            return item_title;
        }
        public TextView getDescription() {
            return description;
        }

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            investmentVM = new ViewModelProvider((ViewModelStoreOwner) itemView.getContext()).get(InvestmentVM.class);
            item_title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            more = itemView.findViewById(R.id.more_button);
            more.setOnClickListener(this);
        }
         @Override
         public void onClick(View v) {

             listener.onClick(getAdapterPosition());
         }
    }
    public interface OnListItemClickListener{
        void onClick(int listClick);

    }

}


