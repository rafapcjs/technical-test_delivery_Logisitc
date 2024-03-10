package com.techincalPractice.Logistic.repositories;

import com.techincalPractice.Logistic.entities.DeliveryWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDeliveryWareHouse extends JpaRepository<DeliveryWarehouse,Long> {
}
