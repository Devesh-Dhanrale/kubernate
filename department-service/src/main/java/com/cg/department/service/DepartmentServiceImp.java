package com.cg.department.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.department.dao.DepartmentDao;
import com.cg.department.entity.Department;

@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	private DepartmentDao dao;

	@Override
	public Department savedepartment(Department department) {
		return  dao.save(department);
		}

	@Override
	public Optional<Department> findDepartmentById(Long departmentid) {
		
		return dao.findById(departmentid);
	}
	
}
