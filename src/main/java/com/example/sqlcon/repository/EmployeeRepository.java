package com.example.sqlcon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sqlcon.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{

}
