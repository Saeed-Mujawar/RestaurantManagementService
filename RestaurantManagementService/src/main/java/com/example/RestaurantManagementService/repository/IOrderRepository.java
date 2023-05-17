package com.example.RestaurantManagementService.repository;

import com.example.RestaurantManagementService.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Orders, Long> {
}
