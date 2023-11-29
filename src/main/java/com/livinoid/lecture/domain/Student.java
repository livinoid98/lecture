package com.livinoid.lecture.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id @GeneratedValue
    @Column(name="student_id")
    private Long id;

    private String address;
}
