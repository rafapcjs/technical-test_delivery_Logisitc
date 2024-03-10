package com.techincalPractice.Logistic.controllers.controllerLogisitLand;

import com.techincalPractice.Logistic.services.ImplServices.ImplServicesLogisticLand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/save/land")
public class SaveLogisticLand {
    @Autowired
    private ImplServicesLogisticLand implServicesLogisticLand;
}
