package com.techincalPractice.Logistic.services.ImplServices;

import com.techincalPractice.Logistic.dao.ImplDao.DaoImplLogisticMaritime;
import com.techincalPractice.Logistic.entities.LogisticMaritime;
import com.techincalPractice.Logistic.services.ServicesLogisticMaritime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImplServicesLogisticMaritime implements ServicesLogisticMaritime {
    @Autowired
    private DaoImplLogisticMaritime daoImplLogisticMaritime;
    @Override
    public void save(LogisticMaritime logisticMaritime) {
        daoImplLogisticMaritime.save(logisticMaritime);

    }
}
