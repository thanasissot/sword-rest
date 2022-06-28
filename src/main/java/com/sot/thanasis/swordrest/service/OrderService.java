package com.sot.thanasis.swordrest.service;

import com.sot.thanasis.swordrest.model.Order;
import com.sot.thanasis.swordrest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    // CREATE
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // READ
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    // DELETE
    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
