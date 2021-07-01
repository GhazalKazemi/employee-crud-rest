package com.springboot.employeecrudrest.service;

import com.springboot.employeecrudrest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int employeeId);

    void save(Employee employee);

    void deleteById(int employeeId);
}
