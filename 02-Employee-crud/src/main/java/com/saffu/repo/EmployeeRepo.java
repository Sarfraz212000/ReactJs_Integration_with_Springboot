package com.saffu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saffu.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}
