package com.techincalPractice.Logistic.dto;

import com.techincalPractice.Logistic.entities.LogisitcLand;
import com.techincalPractice.Logistic.entities.LogisticMaritime;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DtoCustomer {

    private String name;
    private String phone;
    @Column(unique = true)
    private Integer cedula;
    private List<LogisticMaritime> logisticMaritimes=new ArrayList<>();
    private  List<LogisitcLand>logisitcLandList=new ArrayList<>();

}
