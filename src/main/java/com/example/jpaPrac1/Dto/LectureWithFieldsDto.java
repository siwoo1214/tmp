package com.example.jpaPrac1.Dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class LectureWithFieldsDto {
    private String uploaderId;
    private String nickname;
    private String name;
    private String outline;
    private String introduction;
    private int price;
    private Integer discountRate;
    private int difficulty;
    private Integer bookmark;
    private Integer student;
    private Date uploadDate;
    //private List<String> interests; // 관심 분야 이름들 이거 근데 지금 값이 하나밖에 안들어가있어서
    private String interests; // 관심 분야 이름들
}
