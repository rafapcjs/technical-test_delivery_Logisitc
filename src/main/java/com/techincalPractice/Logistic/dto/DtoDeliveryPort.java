package com.techincalPractice.Logistic.dto;

import com.techincalPractice.Logistic.entities.LogisticMaritime;

import java.util.ArrayList;
import java.util.List;

public class DtoDeliveryPort {
    private String name;
    private String deparment;
    private String country;
    private  String ubication;
    private List<LogisticMaritime> logisticMaritimes= new ArrayList<>();
}
