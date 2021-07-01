package com.springboot.employeecrudrest.service;

import com.springboot.employeecrudrest.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{



    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(int employeeId) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void deleteById(int employeeId) {

    }
}
