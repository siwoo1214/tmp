package com.example.jpaPrac1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @Column(name = "user_id", length = 8)
    private String userId;

    @Column(name = "user_type", nullable = false)
    private byte userType;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false, unique = true, length = 255)
    private String nickname;

    @Column(name = "profile_image_address", length = 255)
    private String profileImageAddress;

    @Column(name = "active_type", nullable = false)
    private byte activeType;
}

