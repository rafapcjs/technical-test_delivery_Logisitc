package com.techincalPractice.Logistic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "customers")
public class Customer extends  Persons {
    @OneToMany(mappedBy = "customer" ,orphanRemoval = true,targetEntity = LogisticMaritime.class,fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
@JsonIgnore
    private List<LogisticMaritime>logisticMaritimes=new ArrayList<>();

    @OneToMany(mappedBy = "customer" ,orphanRemoval = true ,fetch = FetchType.LAZY
    ,cascade = CascadeType.ALL
    ,targetEntity = LogisitcLand.class)
    @JsonIgnore
    private  List<LogisitcLand>logisitcLandList=new ArrayList<>();



}
