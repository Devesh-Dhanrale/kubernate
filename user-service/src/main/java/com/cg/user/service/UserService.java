package com.cg.user.service;

import java.util.List;
import java.util.Optional;

import com.cg.user.entity.User;
import com.cg.user.vo.ResponseTemplateVo;



public interface UserService {

	public User saveUser(User user);


	public ResponseTemplateVo getUserWithDepartment(Long userid);
}
