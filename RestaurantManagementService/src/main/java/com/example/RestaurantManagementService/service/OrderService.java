package com.example.RestaurantManagementService.service;

import com.example.RestaurantManagementService.model.Orders;
import com.example.RestaurantManagementService.model.User;
import com.example.RestaurantManagementService.repository.IOrderRepository;
import com.example.RestaurantManagementService.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrderRepository orderRepository;

    @Autowired
    IUserRepository userRepository;

    public Orders createOrder(Orders order) {
        // Perform any validation or additional logic here
//        User user=userRepository.findFirstByUserContact(order.getUser().getUserContact());

//        if(user!=null){
//            throw new IllegalStateException("user does not exists!!!");
//        }


//        Integer addressID = myOrder.getOrderAddress().getAddressId();
//        Address myAddress  = iAddressRepo.findByAddressId(addressID);

//        boolean ans=userRepository.existsById(order.getUser().getId());
//        if(!ans){
//            throw new IllegalStateException("user does not exists!!!");
//        }

        Long userId = order.getUser().getUserId();
        User myUser = userRepository.findByUserId(userId);
        if(myUser!=null){
            order.setUser(myUser);
            orderRepository.save(order);
        }else{
            throw new IllegalStateException("user does not exists!!!");
        }
        return order;
    }




    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public Orders getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public Orders updateOrder(Orders order) {
        // Perform any validation or additional logic here
        return orderRepository.save(order);
    }
}

