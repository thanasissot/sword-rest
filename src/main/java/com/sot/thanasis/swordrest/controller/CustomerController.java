package com.sot.thanasis.swordrest.controller;

import com.sot.thanasis.swordrest.model.Customer;
import com.sot.thanasis.swordrest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable(value = "id") int customerNumber) {
        Optional<Customer> optionalCustomer = customerService.getCustomerByID(customerNumber);
        return optionalCustomer.orElse(null);
    }

    @RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }
}
