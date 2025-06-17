package com.example.jpaPrac1.service;

import com.example.jpaPrac1.Dto.Lecture;

import java.util.List;

public interface LectureService {
    List<Lecture> getAllLectures();
    Lecture getLectureById(String lectureId);
    void addLecture(Lecture lecture);
}
