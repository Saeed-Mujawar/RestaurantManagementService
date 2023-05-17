package com.example.RestaurantManagementService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private int quantity;

    private String status;


    private LocalDateTime createdDateTime;

    @ManyToOne(cascade =CascadeType.ALL)
    private FoodItem foodItem;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;


}