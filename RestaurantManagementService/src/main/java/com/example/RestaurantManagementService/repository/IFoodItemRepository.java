package com.example.RestaurantManagementService.repository;

import com.example.RestaurantManagementService.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodItemRepository extends JpaRepository<FoodItem, Long> {

}
