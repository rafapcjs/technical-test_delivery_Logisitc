package com.techincalPractice.Logistic.services.ImplServices;

import com.techincalPractice.Logistic.dao.ImplDao.DaoImplLogisitLand;
import com.techincalPractice.Logistic.entities.LogisitcLand;
import com.techincalPractice.Logistic.services.ServicesLogisitcLand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplServicesLogisticLand implements ServicesLogisitcLand {
@Autowired
    private DaoImplLogisitLand daoImplLogisitLand;

    @Override
    public void save(LogisitcLand logisitcLand) {
        daoImplLogisitLand.save(logisitcLand);
    }
}


