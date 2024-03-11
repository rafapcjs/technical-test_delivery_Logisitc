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
@Table(name ="maritime" )
public class LogisticMaritime extends  Logistics{




    @Pattern(regexp="[A-Z]{3}[0-9]{4}[A-Za-z]", message="El formato del número de flota no es válido")
    private String fleetNumber;


    @ManyToOne(targetEntity = DeliveryPort.class , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "id_delivery_port",nullable = false)
    @JsonIgnore
    private DeliveryPort  deliveryPort;



}
