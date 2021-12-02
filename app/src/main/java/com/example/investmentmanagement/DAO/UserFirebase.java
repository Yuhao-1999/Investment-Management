package com.example.investmentmanagement.DAO;

import android.util.Log;

import com.example.investmentmanagement.Models.User;
import com.example.investmentmanagement.Views.FirebaseConfig;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class UserFirebase {
    public static FirebaseUser getCurrentUser() {
        FirebaseAuth user = FirebaseConfig.getFirebaseAuth();
        return user.getCurrentUser();
    }

    public static void updateUsername(String username) {
        try {

            // Account logged in the App
            FirebaseUser loggedAccount = getCurrentUser();

            // Config object to edit profile
            UserProfileChangeRequest profile = new UserProfileChangeRequest
                    .Builder()
                    .setDisplayName(username)
                    .build();

            loggedAccount.updateProfile(profile).addOnCompleteListener(task -> {
                if( !task.isSuccessful() ) {
                    Log.d("Profile", "Error when trying to update username.");
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static User getUserData() {

        FirebaseUser firebaseUser = getCurrentUser();

        User user = new User();
        user.setEmail(firebaseUser.getEmail() );
        user.setUserName(firebaseUser.getDisplayName());

        return user;
    }
}



