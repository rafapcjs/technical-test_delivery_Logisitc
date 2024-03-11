package com.techincalPractice.Logistic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "logisitc_land")
public class LogisitcLand extends  Logistics{

    @Pattern(regexp="[A-Z]{3}[0-9]{3}", message="El formato de la placa debe ser de 3 letras seguidas de 3 números")
    private String licensePlate;

    @ManyToOne(targetEntity = DeliveryWarehouse.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_delivery_warehouse", nullable = false)
    @JsonIgnore
    private DeliveryWarehouse deliveryWarehouse;

    @ManyToOne(targetEntity = Customer.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "id_customer", nullable = false)
    private Customer customer;




}
