package com.saffu.service;

import java.util.List;

import com.saffu.entity.EmployeeEntity;

public interface EmployeeServices {
	
	public Boolean saveEmployee(EmployeeEntity entity);
	
	public List<EmployeeEntity> getAllEmployee();
	
	public EmployeeEntity findById(Integer id);
	
	public void deleteById(Integer id);
	
	public EmployeeEntity update(EmployeeEntity entity);
}
