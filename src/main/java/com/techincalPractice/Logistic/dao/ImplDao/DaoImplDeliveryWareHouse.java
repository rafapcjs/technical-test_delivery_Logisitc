package com.techincalPractice.Logistic.dao.ImplDao;

import com.techincalPractice.Logistic.dao.DaoDeliveryWareHouse;
import com.techincalPractice.Logistic.entities.DeliveryWarehouse;
import com.techincalPractice.Logistic.repositories.RepositoryDeliveryWareHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoImplDeliveryWareHouse implements DaoDeliveryWareHouse {
    @Autowired
    private RepositoryDeliveryWareHouse repositoryDeliveryWareHouse;

    @Override
    public void save(DeliveryWarehouse deliveryWarehouse) {
        repositoryDeliveryWareHouse.save(deliveryWarehouse);
    }
}
