package com.example.jpaPrac1.mapper;

import com.example.jpaPrac1.Dto.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAllUsers();
    User findUserById(String userId);
    void insertUser(User user);
}

