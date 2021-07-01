package com.springboot.employeecrudrest.dao;

import com.springboot.employeecrudrest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
