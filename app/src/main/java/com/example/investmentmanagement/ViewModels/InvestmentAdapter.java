package com.example.investmentmanagement.ViewModels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.investmentmanagement.Models.Investment;
import com.example.investmentmanagement.R;

import java.util.List;

public class InvestmentAdapter extends RecyclerView.Adapter<InvestmentAdapter.ViewHolder> {

    List<Investment> investmentList;
    OnListItemClickListener listener;

    public InvestmentAdapter(List<Investment> investmentList,OnListItemClickListener listener) {
        this.investmentList = investmentList;
        this.listener=listener;
    }

    @NonNull
    @Override
    public InvestmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.investment_item
                ,parent,false);
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

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
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


