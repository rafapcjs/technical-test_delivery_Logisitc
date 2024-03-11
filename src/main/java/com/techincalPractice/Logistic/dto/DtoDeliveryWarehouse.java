package com.techincalPractice.Logistic.dto;

import com.techincalPractice.Logistic.entities.LogisitcLand;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DtoDeliveryWarehouse {
    private String name;
    private String deparment;
    private String country;
    private  String ubication;
    private List<LogisitcLand> logisticLandList = new ArrayList<>();
}
