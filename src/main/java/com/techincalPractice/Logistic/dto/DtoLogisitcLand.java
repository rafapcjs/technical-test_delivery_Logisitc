package com.techincalPractice.Logistic.dto;

import com.techincalPractice.Logistic.entities.Customer;
import com.techincalPractice.Logistic.entities.DeliveryWarehouse;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DtoLogisitcLand {
    private String productType;

    private LocalDate startDate;
    private LocalDate finishDate;
    private double priceOfSend; @Size(min =10, max=10 ,message = "El número de guía debe tener 10 caracteres")
    private String guideNumber;
    @Pattern(regexp="[A-Z]{3}[0-9]{3}", message="El formato de la placa debe ser de 3 letras seguidas de 3 números")
    private String licensePlate;
    private DeliveryWarehouse deliveryWarehouse;
    private Customer customer;
}
