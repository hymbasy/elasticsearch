package com.alex.service.impl;

import com.alex.dao.EmployeeRepository;
import com.alex.model.Employee;
import com.alex.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Employee findById(String id) {
        Employee employee = employeeRepository.queryEmployeeById(id);
        return employee;
    }
}
