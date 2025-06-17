package com.example.jpaPrac1.controller;

import com.example.jpaPrac1.Dto.Lecture;
import com.example.jpaPrac1.Dto.LectureWithFieldsDto;
import com.example.jpaPrac1.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/lectures")
public class LectureController {

    private final LectureService lectureService;

    @Autowired
    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping("/golectures")
    public String golecture(){
        return "allLectures";
    }

    // 전체 강의 조회
    @ResponseBody
    @GetMapping
    public List<LectureWithFieldsDto> getAllLectures() {
        for(LectureWithFieldsDto list : lectureService.getAllOfLectures()){
            System.out.println(list.toString());
        }
        return lectureService.getAllOfLectures();
    }

    // 특정 강의 조회
    @ResponseBody
    @GetMapping("/{lectureId}")
    public LectureWithFieldsDto getLectureById(@PathVariable String lectureId) {
        return lectureService.getLectureDetail(lectureId);
    }

    // 강의 등록
    @ResponseBody
    @PostMapping
    public ResponseEntity<String> addLecture(@RequestBody LectureWithFieldsDto lecture) {
        lectureService.addLecture(lecture);
        return ResponseEntity.ok("Lecture added successfully.");
    }
}