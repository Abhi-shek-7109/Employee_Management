package com.sprint_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint_2.entity.Employee;

public interface EmployeRepo extends JpaRepository<Employee, Integer> {

}
