package com.cg.user.vo;

import java.util.Optional;

import com.cg.user.entity.User;

public class ResponseTemplateVo {

	private Optional<User> user;
	private Department dept;


	
	@Override
	public String toString() {
		return "ResponseTemplateVo [user=" + user + ", dept=" + dept + "]";
	}
	public ResponseTemplateVo() {
		// TODO Auto-generated constructor stub
	}	
	
	public ResponseTemplateVo(Optional<User> user, Department dept) {
		super();
		this.user = user;
		this.dept = dept;
	}
	public Optional<User> getUser() {
		return user;
	}
	public void setUser(Optional<User> user) {
		this.user = user;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

	
	
}
