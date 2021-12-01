package com.example.investmentmanagement.Repository;

import com.example.investmentmanagement.DAO.UserDAO;
import com.example.investmentmanagement.Models.User;

public class UserRepository {
    private static UserRepository instance;
    private final UserDAO userDAO;

    private UserRepository() {
        userDAO = UserDAO.getInstance();
    }

    public static synchronized UserRepository getInstance() {
        if(instance == null)
            instance = new UserRepository();
        return instance;
    }

    public void AddUser(User user) {
        userDAO.addUser(user);
    }
}
