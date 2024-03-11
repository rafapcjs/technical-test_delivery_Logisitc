package com.techincalPractice.Logistic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

 @NoArgsConstructor

@AllArgsConstructor
@MappedSuperclass
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String phone;
    @Column(unique = true)
    private Integer cedula;

}
