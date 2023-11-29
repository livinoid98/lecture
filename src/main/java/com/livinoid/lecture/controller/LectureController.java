package com.livinoid.lecture.controller;

import com.livinoid.lecture.domain.Lecture;
import com.livinoid.lecture.repository.LectureRepository;
import com.livinoid.lecture.service.LectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class LectureController {

    private final LectureService lectureService;
}