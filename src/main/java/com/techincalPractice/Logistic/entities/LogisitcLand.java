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
@Table(name ="logisitc_land" )
public class LogisitcLand extends  Logistics{
    private  String aaa;
    @OneToMany(mappedBy = "logisitcLand" , orphanRemoval = true ,fetch = FetchType.LAZY,cascade = CascadeType.ALL, targetEntity = DeliveryWarehouse.class)
    @JsonIgnore
    private List<LogisitcLand> logisitcLandList= new ArrayList<>();
}
