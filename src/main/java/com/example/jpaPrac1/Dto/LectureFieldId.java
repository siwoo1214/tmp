package com.example.jpaPrac1.Dto;

import java.io.Serializable;
import java.util.Objects;

public class LectureFieldId implements Serializable {

    private String lecture;
    private String interested;

    public LectureFieldId() {}

    public LectureFieldId(String lecture, String interested) {
        this.lecture = lecture;
        this.interested = interested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LectureFieldId)) return false;
        LectureFieldId that = (LectureFieldId) o;
        return Objects.equals(lecture, that.lecture) && Objects.equals(interested, that.interested);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lecture, interested);
    }
}
