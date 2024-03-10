package com.techincalPractice.Logistic.repositories;

import com.techincalPractice.Logistic.entities.LogisitcLand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLogisticLand extends JpaRepository<LogisitcLand,Long> {

}
