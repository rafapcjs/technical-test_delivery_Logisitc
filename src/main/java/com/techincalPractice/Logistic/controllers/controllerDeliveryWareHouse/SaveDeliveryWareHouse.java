package com.techincalPractice.Logistic.controllers.controllerDeliveryWareHouse;

import com.techincalPractice.Logistic.services.ImplServices.ImplServicesDeliveryWareHouse;
import com.techincalPractice.Logistic.services.ImplServices.ImplServicesLogisticLand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/save/delivery/warehouse")
public class SaveDeliveryWareHouse {
    @Autowired
    private ImplServicesDeliveryWareHouse implServicesDeliveryWareHouse;
}
