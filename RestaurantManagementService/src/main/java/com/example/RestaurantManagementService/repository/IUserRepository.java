package com.example.RestaurantManagementService.repository;

import com.example.RestaurantManagementService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {


    User findFirstByuserContact(String userContact);


    User findByUserId(Long userId);
}
