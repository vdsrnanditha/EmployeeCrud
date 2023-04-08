package com.example.sqlcon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sqlcon.entity.Employee;

@Service
public interface EmployeeService {
	@Autowired
	public Employee createEmp(Employee emp);
	public List<Employee> getEmployees();
	public Employee getEmployee(int id);
	public Employee updateEmp(Employee emp,int id);
	public void deleteEmp(int id);
	
	
}
