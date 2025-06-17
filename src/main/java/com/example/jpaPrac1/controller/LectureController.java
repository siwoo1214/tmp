package com.example.jpaPrac1.controller;

import com.example.jpaPrac1.Dto.Lecture;
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
    public List<Lecture> getAllLectures() {
        for(Lecture list : lectureService.getAllLectures()){
            System.out.println(list.toString());
        }
        return lectureService.getAllLectures();
    }

    // 특정 강의 조회
    @ResponseBody
    @GetMapping("/{lectureId}")
    public Lecture getLectureById(@PathVariable String lectureId) {
        return lectureService.getLectureById(lectureId);
    }

    // 강의 등록
    @ResponseBody
    @PostMapping
    public ResponseEntity<String> addLecture(@RequestBody Lecture lecture) {
        lectureService.addLecture(lecture);
        return ResponseEntity.ok("Lecture added successfully.");
    }
}