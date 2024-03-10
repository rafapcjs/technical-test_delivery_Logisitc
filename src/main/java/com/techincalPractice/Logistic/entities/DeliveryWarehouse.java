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
@Table(name ="delivery_wareHouse" )
public class DeliveryWarehouse extends  RegistrationLocation {
    private  String aaa;
            @ManyToOne(targetEntity = LogisitcLand.class , cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name = "id_logistic",nullable = false)
            @JsonIgnore
    private LogisitcLand logisitcLand;
}
