package com.sot.thanasis.swordrest.repository;

import com.sot.thanasis.swordrest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAllByCountry(String country);

}
