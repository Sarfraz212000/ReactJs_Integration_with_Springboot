package com.saffu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saffu.entity.EmployeeEntity;
import com.saffu.service.EmployeeServices;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeServices empServices;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeEntity entity){
		Boolean status = empServices.saveEmployee(entity);
		if (status) {
			return new ResponseEntity<>("data insert sucessfully",HttpStatus.CREATED);
		}
		return new ResponseEntity<>("data insert sucessfully",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@PutMapping("/update")
	public EmployeeEntity update(@RequestBody EmployeeEntity entity) {
		return empServices.update(entity);
	}

}
