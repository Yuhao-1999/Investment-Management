package com.example.investmentmanagement.Views;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

    public class FirebaseConfig {
        private static DatabaseReference databaseReference;
        private static FirebaseAuth firebaseAuth;

        public static DatabaseReference getDatabaseReference() {
            if (databaseReference == null) {
                databaseReference = FirebaseDatabase.getInstance("https://investment-management-34dfe-default-rtdb.europe-west1.firebasedatabase.app/").getReference();
            }
            return databaseReference;
        }

        public static FirebaseAuth getFirebaseAuth() {
            if (firebaseAuth == null) {
                firebaseAuth = FirebaseAuth.getInstance();
            }
            return firebaseAuth;
        }
    }

