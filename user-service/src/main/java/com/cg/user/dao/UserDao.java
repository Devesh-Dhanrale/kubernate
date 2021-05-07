package com.cg.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cg.user.entity.User;

@Repository
public interface UserDao extends JpaRepository<User,Long> {

}
