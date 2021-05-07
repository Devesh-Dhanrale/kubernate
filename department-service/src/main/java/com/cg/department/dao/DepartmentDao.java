package com.cg.department.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.department.entity.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department,Long> {

}
