package com.example.investmentmanagement.ViewModels;


import androidx.lifecycle.ViewModel;

import com.example.investmentmanagement.Models.User;
import com.example.investmentmanagement.Repository.UserRepository;

public class UserVM extends ViewModel {

    private final UserRepository userRepository;

    public UserVM(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void AddUser(User user){
        userRepository.AddUser(user);
    }

}
