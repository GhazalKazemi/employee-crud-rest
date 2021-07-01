package com.springboot.employeecrudrest.service;

import com.springboot.employeecrudrest.dao.EmployeeDAO;
import com.springboot.employeecrudrest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

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
