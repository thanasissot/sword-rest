package com.sot.thanasis.swordrest.controller;

import com.sot.thanasis.swordrest.model.OrderDetail;
import com.sot.thanasis.swordrest.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailController {
    @Autowired
    OrderDetailService orderDetailService;

    @RequestMapping(value="/allorderdetails", method = RequestMethod.GET)
    public List<OrderDetail> readOrderDetails() {
        return orderDetailService.getOrderDetails();
    }


}
