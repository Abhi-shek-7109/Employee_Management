package com.sprint_2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint_2.entity.Employee;
import com.sprint_2.repository.DepRepo;
import com.sprint_2.repository.EmployeRepo;

@Service
public class empservices {

	@Autowired
	DepRepo depRepo;
	
	@Autowired
	
	EmployeRepo empRepo;
	//save add 
	public Employee addEmp(Employee emp) {
		return empRepo.save(emp);
	}
	
	public List<Employee> addEmps(List<Employee> emps) {
		return empRepo.saveAll(emps);
	}
	
	
	//get by id 
	public Employee getEmpbyId(int id) {
		return empRepo.findById(id).orElse(null);
		
	}
	
	public List<Employee> getEmployees(){
		return empRepo.findAll();
	}
	
	//delete
	public String fireEmployee(int id) {
		depRepo.deleteById(id);
		return "Employee is fired" +id;
	}
	
	//update
	public Employee updateInfo(Employee empUp) {
		Employee exsistingEmp = empRepo.findById(empUp.getId()).orElse(null);
		exsistingEmp.setEmail(empUp.getEmail());
		exsistingEmp.setEmpAge(empUp.getEmpAge());
		exsistingEmp.setEmpName(empUp.getEmpName());
		return exsistingEmp;
	}
	
}
