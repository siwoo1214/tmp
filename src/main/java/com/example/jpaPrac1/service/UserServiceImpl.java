package com.example.jpaPrac1.service;

import com.example.jpaPrac1.Dto.User;
import com.example.jpaPrac1.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    // 생성자 주입
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public User getUserById(String userId) {
        return userMapper.findUserById(userId);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }
}

