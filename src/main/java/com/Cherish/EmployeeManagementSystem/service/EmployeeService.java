package com.Cherish.EmployeeManagementSystem.service;

import com.Cherish.EmployeeManagementSystem.exception.UserNotFoundException;
import com.Cherish.EmployeeManagementSystem.model.Employee;
import com.Cherish.EmployeeManagementSystem.repo.EmployeeRepo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " wa not found"));
    }

    @Transactional
    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
