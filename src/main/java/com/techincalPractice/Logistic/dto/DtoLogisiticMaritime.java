package com.techincalPractice.Logistic.dto;

import com.techincalPractice.Logistic.entities.Customer;
import com.techincalPractice.Logistic.entities.DeliveryPort;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class DtoLogisiticMaritime {
    private String productType;

    private LocalDate startDate;
    private LocalDate finishDate;
    private double priceOfSend;
    @Size(min = 10, max = 10, message = "El número de guía debe tener 10 caracteres")
    private String guideNumber;
    @Pattern(regexp = "[A-Z]{3}[0-9]{4}[A-Za-z]", message = "El formato del número de flota no es válido")
    private String fleetNumber;
    private DeliveryPort deliveryPort;
    private Customer customer;

}