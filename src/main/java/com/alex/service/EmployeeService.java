package com.alex.service;

import com.alex.model.Employee;

public interface EmployeeService {
    void save(Employee employee);

    void delete(Employee employee);

    Employee findById(String id);
}
