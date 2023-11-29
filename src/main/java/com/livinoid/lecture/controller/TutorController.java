package com.livinoid.lecture.controller;

import com.livinoid.lecture.domain.LectureInfo;
import com.livinoid.lecture.domain.Tutor;
import com.livinoid.lecture.service.TutorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class TutorController {

    private final TutorService tutorService;
    private final Logger logger = Logger.getLogger("mylogger");

    @GetMapping("hello")
    public String hello(){
        return "실행 됨";
    }

    @GetMapping("/tutor/{id}")
    public Tutor showTutor(@PathVariable("id") long tutorId){
        var tutor = tutorService.findById(tutorId);
        Optional<Tutor> tutor1 = tutorService.findById(tutorId);
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[10];
        for (int n : arr) {

        }

        return tutor.orElseThrow(NoSuchElementException::new);
    }
    @PostMapping("/tutor/show")
    public List<LectureInfo> showInfoList(@RequestBody TutorDTO tutorId){
        return tutorService.findLectureByTutorId(tutorId.getTutorId());
    }

}


