package com.example.jpaPrac1.entity;

import com.example.jpaPrac1.entity.LectureField;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "interested")
public class Interested {

    @Id
    private String interestedId;

    private String name;

    @OneToMany(mappedBy = "interested", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LectureField> lectureFields = new ArrayList<>();

    // getter, setter
}

