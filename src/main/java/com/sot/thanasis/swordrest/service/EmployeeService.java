package com.sot.thanasis.swordrest.service;

import com.sot.thanasis.swordrest.model.Employee;
import com.sot.thanasis.swordrest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    // CREATE
    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    // READ
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    // DELETE
    public void deleteEmployee(Long empId) {
        employeeRepository.deleteById(empId);
    }
}