package com.livinoid.lecture.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Tutor {

    @Id
    @GeneratedValue
    @Column(name = "tutor_id")
    private Long id;

    private String name;

    private int age;

    private Gender gender;
}
