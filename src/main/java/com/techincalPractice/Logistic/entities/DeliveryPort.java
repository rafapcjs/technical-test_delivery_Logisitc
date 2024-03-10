package com.techincalPractice.Logistic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="delivery_port" )
public class DeliveryPort extends  RegistrationLocation {

    private  String aaa;

    @ManyToOne(targetEntity = LogisticMaritime.class , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "id_logist_marine",nullable = false)
    @JsonIgnore
    private LogisticMaritime  logisticMaritime;
}
