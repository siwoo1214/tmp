package com.example.jpaPrac1.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId;
    private int userType;
    private String password;
    private String email;
    private String nickname;
    private String profileImageAddress;
    private int activeType;
}