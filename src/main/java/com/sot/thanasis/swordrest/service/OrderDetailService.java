package com.sot.thanasis.swordrest.service;

import com.sot.thanasis.swordrest.model.OrderDetail;
import com.sot.thanasis.swordrest.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {
    @Autowired
    OrderDetailRepository orderDetailRepository;

    // CREATE
    public OrderDetail createOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    // READ
    public List<OrderDetail> getOrderDetails() {
        return orderDetailRepository.findAll();
    }

    // DELETE
    public void deleteOrderDetail(Long orderDetailId) {
        orderDetailRepository.deleteById(orderDetailId);
    }
}
