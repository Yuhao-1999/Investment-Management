package com.example.investmentmanagement.Views.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.investmentmanagement.DAO.UserFirebase;
import com.example.investmentmanagement.Models.User;
import com.example.investmentmanagement.R;
import com.example.investmentmanagement.Views.FirebaseConfig;
import com.example.investmentmanagement.Views.MainActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    FirebaseAuth mAuth;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    TextView DBEmail;

    private User userProfile;

    private DatabaseReference firebaseRef;
    private DatabaseReference usersRef;
    private DatabaseReference userProfileRef;
    private ValueEventListener valueEventListenerUser;


    public SettingsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SettingsFragment newInstance(String param1, String param2) {
        SettingsFragment fragment = new SettingsFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        userProfile = UserFirebase.getUserData();
        firebaseRef = FirebaseConfig.getDatabaseReference();
        usersRef = firebaseRef.child("users");

        TextView DBEmail =  view.findViewById(R.id.email);
        TextView DBUsername = view.findViewById(R.id.username);
        TextView DBPassword = view.findViewById(R.id.password);
        TextView DBBudget = view.findViewById(R.id.budget);
        Button sign_out = view.findViewById(R.id.sign_outButton);

        mAuth = FirebaseAuth.getInstance();
        String uID = mAuth.getCurrentUser().getUid();
        userProfileRef = usersRef.child(uID);

        userProfileRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String email = snapshot.child("email").getValue(String.class);
                DBEmail.setText(email);

                String username = snapshot.child("username").getValue(String.class);
                DBUsername.setText(username);

                String password = snapshot.child("password").getValue(String.class);
                DBPassword.setText(password);

                String budget = snapshot.child("budget").getValue(String.class);
                DBBudget.setText(budget);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                onDestroy();
            }
        });
        return view;
    }


}



