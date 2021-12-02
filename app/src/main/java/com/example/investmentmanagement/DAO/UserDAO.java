package com.example.investmentmanagement.DAO;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.investmentmanagement.Models.User;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class UserDAO {
    private DatabaseReference reference;
    private static UserDAO instance;

    private UserDAO(){
            FirebaseDatabase database = FirebaseDatabase
                    .getInstance();
            reference = database.getReference(User.class.getSimpleName());

            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()){
                        HashMap<String,String> map = (HashMap<String, String>) child.getValue();
                        User user = new User(map.get("username"),map.get("email"),map.get("password"));
                        Log.i("USER DAO","USER: "+user.toString());
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Log.w("USER DAO", "Failed to read value.", error.toException());
                }
            });
    }
    public static synchronized UserDAO getInstance() {
        if (instance == null){
            instance = new UserDAO();
        }
        return instance;
    }

    public Task<Void> addUser(User user){
        reference.child(user.getUserName()).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    Log.i("User DAO","USERNAME ALREADY EXISTS");
                }
                else {
                    reference.child(user.getUserName()).setValue(user);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        return null;
    }

}

