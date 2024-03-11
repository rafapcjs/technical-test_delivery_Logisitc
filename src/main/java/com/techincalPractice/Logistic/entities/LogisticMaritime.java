package com.techincalPractice.Logistic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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
    @ManyToOne(targetEntity = DeliveryPort.class , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "id_delivery_port",nullable = false)
    @JsonIgnore
    private DeliveryPort  deliveryPort;

    private  String aaa;

}
