package com.example.jpaPrac1.service;

import com.example.jpaPrac1.Dto.Lecture;
import com.example.jpaPrac1.Dto.LectureWithFieldsDto;

import java.util.List;

public interface LectureService {
//    List<Lecture> getAllLectures();
//    Lecture getLectureById(String lectureId);
    void addLecture(LectureWithFieldsDto lecture);
    // 얘네가 추가한거
    LectureWithFieldsDto getLectureDetail(String lectureId);
    List<LectureWithFieldsDto> getAllOfLectures();
}
