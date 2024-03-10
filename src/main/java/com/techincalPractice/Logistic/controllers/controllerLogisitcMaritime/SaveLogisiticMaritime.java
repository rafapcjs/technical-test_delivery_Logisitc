package com.techincalPractice.Logistic.controllers.controllerLogisitcMaritime;

import com.techincalPractice.Logistic.services.ImplServices.ImplServicesLogisticLand;
import com.techincalPractice.Logistic.services.ImplServices.ImplServicesLogisticMaritime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/save/maritime")
public class SaveLogisiticMaritime {
    @Autowired
    private ImplServicesLogisticMaritime implServicesLogisticMaritime;
}
