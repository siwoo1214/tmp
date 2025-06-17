package com.example.jpaPrac1.service;


import com.example.jpaPrac1.Dto.Lecture;
import com.example.jpaPrac1.mapper.LectureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LectureServiceImpl implements LectureService {

    private final LectureMapper lectureMapper;

    public LectureServiceImpl(LectureMapper lectureMapper) {
        this.lectureMapper = lectureMapper;
    }

    @Override
    public List<Lecture> getAllLectures() {
        return lectureMapper.findAllLectures();
    }

    @Override
    public Lecture getLectureById(String lectureId) {
        return lectureMapper.findLectureById(lectureId);
    }

    @Override
    public void addLecture(Lecture lecture) {
        if (lecture.getUploadDate() == null) {
            lecture.setUploadDate(new Date());
        }
        lectureMapper.addLecture(lecture);
    }
}

