package com.livinoid.lecture.service;

import com.livinoid.lecture.domain.Lecture;
import com.livinoid.lecture.domain.LectureInfo;
import com.livinoid.lecture.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class LectureService {
    private final LectureRepository lectureRepository;

    @Transactional
    public void saveLecture(Lecture lecture){
        lectureRepository.save(lecture);
    }

}
