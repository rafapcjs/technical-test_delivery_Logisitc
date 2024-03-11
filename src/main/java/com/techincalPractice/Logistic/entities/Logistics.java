package com.techincalPractice.Logistic.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
class Logistics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productType;

    private LocalDate startDate;
    private LocalDate finishDate;
    private double priceOfSend; @Size(min =10, max=10 ,message = "El número de guía debe tener 10 caracteres")
    private String guideNumber;
}
