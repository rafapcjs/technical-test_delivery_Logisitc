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
@Table(name ="delivery_wareHouse" )
public class DeliveryWarehouse extends  RegistrationLocation {

    @OneToMany(mappedBy = "deliveryWarehouse", orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity =LogisitcLand.class)
    @JsonIgnore
    private List<LogisitcLand> logisticLandList = new ArrayList<>();


}
