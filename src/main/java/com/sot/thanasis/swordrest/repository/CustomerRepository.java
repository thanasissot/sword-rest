package com.sot.thanasis.swordrest.repository;

import com.sot.thanasis.swordrest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAllByCountry(String country);

}
