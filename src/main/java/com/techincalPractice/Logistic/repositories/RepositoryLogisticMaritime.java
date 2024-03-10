package com.techincalPractice.Logistic.repositories;

import com.techincalPractice.Logistic.entities.LogisticMaritime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLogisticMaritime extends JpaRepository<LogisticMaritime ,Long> {
}
