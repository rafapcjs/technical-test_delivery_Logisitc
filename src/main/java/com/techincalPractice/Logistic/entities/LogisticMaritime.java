package com.techincalPractice.Logistic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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


    private  String aaa;
@OneToMany(mappedBy = "logisticMaritime" ,targetEntity = DeliveryPort.class)
@JsonIgnore
    private List<DeliveryPort>deliveryPortList= new ArrayList<>();
}
