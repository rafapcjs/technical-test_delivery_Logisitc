package com.techincalPractice.Logistic.services.ImplServices;

import com.techincalPractice.Logistic.dao.ImplDao.DaoImplDeliveryWareHouse;
import com.techincalPractice.Logistic.entities.DeliveryWarehouse;
import com.techincalPractice.Logistic.services.ServicesDeliveryWareHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplServicesDeliveryWareHouse implements ServicesDeliveryWareHouse {
    @Autowired
    private DaoImplDeliveryWareHouse daoImplDeliveryWareHouse;
    @Override
    public void save(DeliveryWarehouse deliveryWarehouse) {
        daoImplDeliveryWareHouse.save(deliveryWarehouse);
    }
}
