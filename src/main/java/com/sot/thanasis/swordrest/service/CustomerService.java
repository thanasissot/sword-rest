package com.sot.thanasis.swordrest.service;

import com.sot.thanasis.swordrest.model.Customer;
import com.sot.thanasis.swordrest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Customer> getCustomerByID(int customerId) {
        return customerRepository.findById(customerId);
    }

    // DELETE
    public void deleteCustomer(int customerId) {
        customerRepository.deleteById(customerId);
    }

}
