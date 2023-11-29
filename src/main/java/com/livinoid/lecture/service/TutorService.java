package com.livinoid.lecture.service;

import com.livinoid.lecture.domain.Lecture;
import com.livinoid.lecture.domain.LectureInfo;
import com.livinoid.lecture.domain.Tutor;
import com.livinoid.lecture.repository.TutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TutorService {

    private final TutorRepository tutorRepository;

    public void saveTutor(Tutor tutor){
        tutorRepository.save(tutor);
    }

    public Optional<Tutor> findById(Long id){
        Optional<Tutor> tutor = tutorRepository.findById(id);
        return tutor;
    }

    public List<LectureInfo> findLectureByTutorId(Long tutorId){
        List<LectureInfo> lectureInfoById = tutorRepository.findLectureInfoById(tutorId);
        return lectureInfoById;
    }

}
