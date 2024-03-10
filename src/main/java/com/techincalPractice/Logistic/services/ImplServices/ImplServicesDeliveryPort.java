package com.techincalPractice.Logistic.services.ImplServices;

import com.techincalPractice.Logistic.dao.ImplDao.DaoImplDeliveryPort;
import com.techincalPractice.Logistic.entities.DeliveryPort;
import com.techincalPractice.Logistic.services.ServicesDeliveryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplServicesDeliveryPort implements ServicesDeliveryPort  {
    @Autowired
    private DaoImplDeliveryPort daoImplDeliveryPort;
    @Override
    public void save(DeliveryPort deliveryPort) {
        daoImplDeliveryPort.save(deliveryPort);
    }
}
