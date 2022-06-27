package com.sot.thanasis.swordrest.repository;

import com.sot.thanasis.swordrest.model.Customer;
import com.sot.thanasis.swordrest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
