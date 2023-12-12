package com.saffu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saffu.entity.EmployeeEntity;
import com.saffu.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public Boolean saveEmployee(EmployeeEntity entity) {
		empRepo.save(entity);
		return true;
	}

	@Override
	public List<EmployeeEntity> getAllEmployee() {
		return empRepo.findAll();

	}

	@Override
	public EmployeeEntity findById(Integer id) {

		Optional<EmployeeEntity> findById = empRepo.findById(id);
		
		if (findById.isEmpty()) {
			return findById.get();
		}
		return null;

	}

	@Override
	public void deleteById(Integer id) {
		empRepo.deleteById(id);

	}

	@Override
	public EmployeeEntity update(EmployeeEntity entity) {
		 EmployeeEntity employeeEntity = empRepo.findById(entity.getEmpId()).get();
				
			BeanUtils.copyProperties(entity, employeeEntity);
		    empRepo.save(employeeEntity);
			return employeeEntity;
		
	}

}
