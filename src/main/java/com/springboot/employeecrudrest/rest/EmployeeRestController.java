package com.springboot.employeecrudrest.rest;

import com.springboot.employeecrudrest.dao.EmployeeDAOImpl;
import com.springboot.employeecrudrest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAOImpl employeeDAO;
    @Autowired
    public EmployeeRestController(EmployeeDAOImpl employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }
}
