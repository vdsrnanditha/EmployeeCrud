package com.example.sqlcon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.sqlcon.entity.Employee;
import com.example.sqlcon.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@GetMapping( "/")
	public ModelAndView getAllEmployees() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("employees", service.getEmployees());
		return mav;
	}
	@RequestMapping("/new")
	public String add()
	{
		//model.addAttribute("student", new Employee());
		return "check";
	}
	/*@RequestMapping("/")
	public String viewHome(Model model)
	{
		List<Employee> liststudents=service.getEmployees();
		System.out.println("fhuiytfghjuyutgvbj");
		model.addAttribute("liststudents", liststudents);
		return "index";
	}*/
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return service.createEmp(emp);
	}
	@GetMapping("/getemps")
	public List<Employee> getEmps()
	{
	return service.getEmployees();
	}
	@GetMapping("/getemp/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return service.getEmployee(id);
	}
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable int id,@RequestBody Employee emp) { 
		return service.updateEmp(emp, id);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id)
	{
		service.deleteEmp(id);
		return new ResponseEntity<String>("employee deleted done",HttpStatus.OK);
	}
}
