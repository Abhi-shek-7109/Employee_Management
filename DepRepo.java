package com.sprint_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint_2.entity.Department;

public interface DepRepo extends JpaRepository<Department, Integer> {

}
