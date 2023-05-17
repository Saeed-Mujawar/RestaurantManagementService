package com.example.RestaurantManagementService.service;

import com.example.RestaurantManagementService.model.AuthenticationToken;
import com.example.RestaurantManagementService.model.User;
import com.example.RestaurantManagementService.repository.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    ITokenRepo tokenRepo;

    public void saveToken(AuthenticationToken token) {
        tokenRepo.save(token);
    }

    public AuthenticationToken getToken(User user){
       return tokenRepo.findByUser(user);
    }

}
