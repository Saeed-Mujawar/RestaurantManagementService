package com.example.RestaurantManagementService.controller;

import com.example.RestaurantManagementService.dto.SignInInput;
import com.example.RestaurantManagementService.dto.SignInOutput;
import com.example.RestaurantManagementService.dto.SignUpInput;
import com.example.RestaurantManagementService.dto.SignUpOutput;
import com.example.RestaurantManagementService.model.User;
import com.example.RestaurantManagementService.service.TokenService;
import com.example.RestaurantManagementService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService UserService;

    @Autowired
    TokenService tokenService;

    @PostMapping("/signup")
    public SignUpOutput createUser(@RequestBody SignUpInput signUpInput)
    {
        return UserService.signup(signUpInput);
    }

    @PostMapping("/signIn")
    public SignInOutput createUser(@RequestBody SignInInput signInInput)
    {
        return UserService.signIn(signInInput);
    }


    @GetMapping("/getAll")
    public List<User> getAllUsers()
    {
        return UserService.getAllUser();
    }



    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User restaurant)
    {
        return UserService.updateUser(id, restaurant);
    }

}
