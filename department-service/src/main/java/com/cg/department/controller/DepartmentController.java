package com.cg.department.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.department.entity.Department;
import com.cg.department.service.DepartmentService;



@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		System.out.println("Inside the saveDepartment");
		return service.savedepartment(department);
	}
	
	
	@GetMapping("/{id}")
	public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentid)
	{
		return service.findDepartmentById(departmentid);
	}
	
	
}
