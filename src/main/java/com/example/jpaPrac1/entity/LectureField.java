package com.example.jpaPrac1.entity;

import com.example.jpaPrac1.Dto.LectureFieldId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lecture_field")
@IdClass(LectureFieldId.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LectureField {

    @Id
    @ManyToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    @Id
    @ManyToOne
    @JoinColumn(name = "interested_id")
    private Interested interested;

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Interested getInterested() {
        return interested;
    }

    public void setInterested(Interested interested) {
        this.interested = interested;
    }

    // getter, setter
}
