package com.cg.user.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.user.entity.User;

import com.cg.user.service.UserService;
import com.cg.user.vo.ResponseTemplateVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping("/")
	public User saveDepartment(@RequestBody User user)
	{
		System.out.println("Inside the saveDepartment");
		return service.saveUser(user);
	}
	
	
	@GetMapping("/{id}")
	public ResponseTemplateVo getUserWithDepartment(@PathVariable("id") Long userid)
	{
		return service.getUserWithDepartment(userid);
	}
	
	
}
