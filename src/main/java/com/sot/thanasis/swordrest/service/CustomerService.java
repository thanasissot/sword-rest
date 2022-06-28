package com.sot.thanasis.swordrest.service;

import com.sot.thanasis.swordrest.model.Customer;
import com.sot.thanasis.swordrest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    // CREATE
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // READ
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    // DELETE
    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
