package com.springboot.employeecrudrest.dao;

import com.springboot.employeecrudrest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
