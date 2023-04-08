package com.example.sqlcon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sqlcon.entity.Employee;
import com.example.sqlcon.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository repo;
	public Employee createEmp(Employee emp) {
		return repo.save(emp);
	}
	public List<Employee> getEmployees()
	{
		return repo.findAll();
	}
	public Employee getEmployee(int id)
	{
		return repo.findById(id).orElse(null);
	}
	public Employee updateEmp(Employee emp,int id) {
		Employee oldemp=repo.findById(id).orElse(null);
		oldemp.setId(emp.getId());
		oldemp.setStudentname(emp.getStudentname());
		oldemp.setCourse(emp.getCourse());
		oldemp.setFee(emp.getFee());
		repo.save(oldemp);
		return oldemp;
	}
	public void deleteEmp(int id)
	{
		repo.deleteById(id);
	}

}
