package com.techincalPractice.Logistic.dao.ImplDao;

import com.techincalPractice.Logistic.dao.DaoLogisiticMaritime;
import com.techincalPractice.Logistic.entities.LogisticMaritime;
import com.techincalPractice.Logistic.repositories.RepositoryLogisticMaritime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoImplLogisticMaritime  implements DaoLogisiticMaritime {
    @Autowired
    private RepositoryLogisticMaritime repositoryLogisticMaritime;


    @Override
    public void save(LogisticMaritime logisticMaritime) {
        repositoryLogisticMaritime.save(logisticMaritime);
    }
}
