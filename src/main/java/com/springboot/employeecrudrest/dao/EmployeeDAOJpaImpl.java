package com.springboot.employeecrudrest.dao;

import com.springboot.employeecrudrest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private EntityManager entityManager;
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    public List<Employee> findAll() {
        Query employee = entityManager.createQuery("from Employee");
        List<Employee> employees = employee.getResultList();
        return employees;
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
