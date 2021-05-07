package com.cg.department.service;

import java.util.List;
import java.util.Optional;

import com.cg.department.entity.Department;

public interface DepartmentService {

	public Department savedepartment(Department department);

	public Optional<Department> findDepartmentById(Long departmentid);
}
