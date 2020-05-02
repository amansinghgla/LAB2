package com.example.demo.service;


import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entities.Trainee;
import com.example.demo.entities.User;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserDao userDao;
	

	
	public String reteriveuser(String username, String password) {
		
		return userDao.reteriveuser(username, password);
	}

}