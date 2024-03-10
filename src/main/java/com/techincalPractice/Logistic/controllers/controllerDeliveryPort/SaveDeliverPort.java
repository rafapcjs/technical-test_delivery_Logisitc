package com.techincalPractice.Logistic.controllers.controllerDeliveryPort;

import com.techincalPractice.Logistic.services.ImplServices.ImplServicesDeliveryPort;
import com.techincalPractice.Logistic.services.ImplServices.ImplServicesLogisticLand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/save/delivery/port")
public class SaveDeliverPort {
    @Autowired
    private ImplServicesDeliveryPort implServicesDeliveryPort;
}
