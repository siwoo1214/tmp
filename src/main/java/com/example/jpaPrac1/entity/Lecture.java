package com.example.jpaPrac1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lecture")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lecture {

    @Id
    @Column(name = "lecture_id", length = 4)
    private String lectureId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uploader_id", nullable = false)
    private User uploaderId;

    @Column(nullable = false, unique = true, length = 255)
    private String name;

    @Column(nullable = false, length = 255)
    private String outline;

    @Column(nullable = false, length = 255)
    private String introduction;

    @Column(nullable = false)
    private int price;

    @Column(name = "discount_rate")
    private Integer discountRate;

    @Column(nullable = false)
    private byte difficulty;

    @Column
    private Integer bookmark;

    @Column
    private Integer student;

    @Column(name = "upload_date")
    private LocalDate uploadDate;

    @Column(name = "passing_check")
    private Boolean passingCheck;

    @Column(name = "fail_reason", length = 255)
    private String failReason;

    @OneToMany(mappedBy = "lecture", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<LectureField> lectureFields = new ArrayList<>();

    // 편의 메서드
    public void addLectureField(LectureField field) {
        lectureFields.add(field);
        field.setLecture(this);
    }
}
