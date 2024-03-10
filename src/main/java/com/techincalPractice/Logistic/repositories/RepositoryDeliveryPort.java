package com.techincalPractice.Logistic.repositories;

import com.techincalPractice.Logistic.entities.DeliveryPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface RepositoryDeliveryPort extends JpaRepository<DeliveryPort,Long> {
}
