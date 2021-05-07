package com.cg.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.user.dao.UserDao;

import com.cg.user.entity.User;
import com.cg.user.vo.Department;
import com.cg.user.vo.ResponseTemplateVo;

@LoadBalancerClient(name = "user loadbalancer")
@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao dao;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		return  dao.save(user);
		}

	@Override
	public ResponseTemplateVo getUserWithDepartment(Long userid) {
		ResponseTemplateVo vo=new ResponseTemplateVo();
		Optional<User> user = dao.findById(userid);
		
		Department dept= restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+userid,Department.class);
		
		vo.setUser(user);
		vo.setDept(dept);
		
		
		return vo;
	}

}
