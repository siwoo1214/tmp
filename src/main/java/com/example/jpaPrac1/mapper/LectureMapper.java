package com.example.jpaPrac1.mapper;

import com.example.jpaPrac1.Dto.Lecture;
import com.example.jpaPrac1.Dto.LectureWithFieldsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LectureMapper {
//    List<Lecture> findAllLectures();
//    Lecture findLectureById(String lectureId);
    void addLecture(LectureWithFieldsDto lecture);

    // 여기가 추가한거임
    // 전체 조회하는 메소드
    List<LectureWithFieldsDto> findAllLecturesWithFields();
    // 아이디 기준으로 찾기
    LectureWithFieldsDto findLectureWithFields(String lectureId);
}

