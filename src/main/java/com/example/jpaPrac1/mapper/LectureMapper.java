package com.example.jpaPrac1.mapper;

import com.example.jpaPrac1.Dto.Lecture;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LectureMapper {
    List<Lecture> findAllLectures();
    Lecture findLectureById(String lectureId);
    void addLecture(Lecture lecture);
}

