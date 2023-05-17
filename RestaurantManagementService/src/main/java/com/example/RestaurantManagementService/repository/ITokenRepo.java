package com.example.RestaurantManagementService.repository;

import com.example.RestaurantManagementService.model.AuthenticationToken;
import com.example.RestaurantManagementService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo  extends JpaRepository<AuthenticationToken, Long> {

    AuthenticationToken findByUser(User user);

}
