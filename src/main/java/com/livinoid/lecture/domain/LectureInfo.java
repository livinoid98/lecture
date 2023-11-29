package com.livinoid.lecture.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class LectureInfo {

    @Id @GeneratedValue
    @Column(name="lecture_info_id")
    private Long id;

    @Column(name="lecture_time")
    private LocalDateTime time;

    private Long roomNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="lecture_id")
    private Lecture lecture;
}
