package com.livinoid.lecture.repository;

import com.livinoid.lecture.domain.LectureInfo;
import com.livinoid.lecture.domain.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {

    @Query("""
           select lectureInfo
           from Tutor tutor
           left join Lecture lecture on lecture.tutor.id = tutor.id
           left join LectureInfo lectureInfo on lectureInfo.lecture.id = lecture.id
           where tutor.id = :tutorId
           """)
    List<LectureInfo> findLectureInfoById(Long tutorId);
//    List<LectureInfo> findLectureInfoById(@Param("tutorId") Long tutorId);
}
