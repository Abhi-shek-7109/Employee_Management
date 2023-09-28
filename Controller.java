package com.sprint_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sprint_2.entity.Employee;
import com.sprint_2.services.empservices;

import jakarta.validation.Valid;


@RestController
public class Controller {
	@Autowired
	empservices es;
	
	
	//addProduct
	@PostMapping("/addEmp")
	ResponseEntity<String> addEmployee(@Valid @RequestBody Employee emp) {
		return ResponseEntity.ok("User is valid") ;
		
	}
	
	@PostMapping("/addEmps")
	public List<Employee> addEmployees(@Valid @RequestBody List<Employee> emp) {
		return es.addEmps(emp);
		
	}
	@GetMapping("/get")
	public List<Employee> findemployee(){
		return es.getEmployees();
	}
	
	@GetMapping("/get/{id}")
	public Employee getbyID(@PathVariable int id) {
		return es.getEmpbyId(id);
		
	}
	
	@PutMapping("/update")
	ResponseEntity<String> putEmployee(@Valid @RequestBody Employee emp) {
		return ResponseEntity.ok("Update was succesfull");
	}
	
	
	@DeleteMapping("/delete")
	public String fireEmployee (@PathVariable int id) {
		return es.fireEmployee(id);
	}
}
