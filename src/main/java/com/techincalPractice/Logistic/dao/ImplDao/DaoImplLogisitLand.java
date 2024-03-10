package com.techincalPractice.Logistic.dao.ImplDao;

import com.techincalPractice.Logistic.dao.DaoLogisitcLand;
import com.techincalPractice.Logistic.entities.LogisitcLand;
import com.techincalPractice.Logistic.repositories.RepositoryLogisticLand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoImplLogisitLand implements DaoLogisitcLand {
    @Autowired
    private RepositoryLogisticLand repositoryLogisticLand;

    @Override
    public void save(LogisitcLand logisitcLand) {
        repositoryLogisticLand.save(logisitcLand);
    }
}
