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
@Table(name ="delivery_port" )
public class DeliveryPort extends  RegistrationLocation {


    @OneToMany(mappedBy = "deliveryPort" ,targetEntity = LogisticMaritime.class)
    @JsonIgnore
    private List<LogisticMaritime> logisticMaritimes= new ArrayList<>();


}
