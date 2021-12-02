package com.example.investmentmanagement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.investmentmanagement.Models.Investment;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InvestmentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InvestmentFragment extends Fragment {
    RecyclerView rv;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InvestmentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InvestmentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InvestmentFragment newInstance(String param1, String param2) {
        InvestmentFragment fragment = new InvestmentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_investment, container, false);
        rv = view.findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rv.hasFixedSize();
        List<Investment> investmentList = new ArrayList<>();
        investmentList.add(new Investment("GIMME MONEY",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum",
                5000,
                90,
                1,
                50,
                "Technology","1"));
        investmentList.add(new Investment("GIMME MONEY",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum",
                5000,
                90,
                2,
                50,
                "Technology","2"));
        investmentList.add(new Investment("GIMME MONEY",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum",
                5000,
                90,
                3,
                50,
                "Technology","3"));

        InvestmentAdapter adapter = new InvestmentAdapter(investmentList);
        rv.setAdapter(adapter);
        return view;

    }

}