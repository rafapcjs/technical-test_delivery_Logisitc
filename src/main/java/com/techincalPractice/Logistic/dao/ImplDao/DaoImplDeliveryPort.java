package com.techincalPractice.Logistic.dao.ImplDao;

import com.techincalPractice.Logistic.dao.DaoDeliveryPort;
import com.techincalPractice.Logistic.entities.DeliveryPort;
import com.techincalPractice.Logistic.repositories.RepositoryDeliveryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoImplDeliveryPort implements DaoDeliveryPort {
@Autowired
private RepositoryDeliveryPort repositoryDeliveryPort;

    @Override
    public void save(DeliveryPort deliveryPort) {
        repositoryDeliveryPort.save(deliveryPort);
    }
}
