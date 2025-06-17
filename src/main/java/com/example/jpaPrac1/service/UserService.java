package com.example.jpaPrac1.service;

import com.example.jpaPrac1.Dto.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(String userId);
    void addUser(User user);
}

