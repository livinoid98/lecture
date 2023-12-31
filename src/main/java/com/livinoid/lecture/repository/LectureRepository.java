package com.livinoid.lecture.repository;

import com.livinoid.lecture.domain.Lecture;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {

    @EntityGraph
    Optional<Lecture> findFetchById(Long id);
}
