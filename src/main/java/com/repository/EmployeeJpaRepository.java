package com.repository;


import com.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeJpaRepository extends JpaRepository<Employee,Long> {

public Employee findByName(String name);
}
