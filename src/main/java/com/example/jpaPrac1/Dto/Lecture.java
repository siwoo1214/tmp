package com.example.jpaPrac1.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lecture {
    private String lectureId;
    private String uploaderId;
    private String name;
    private String outline;
    private String introduction;
    private int price;
    private Integer discountRate;
    private int difficulty;
    private Integer bookmark;
    private Integer student;
    private Date uploadDate;
    private Boolean passingCheck;
    private String failReason;
}

