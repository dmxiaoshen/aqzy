package com.bell.aqzy.core.service.impl;

import org.springframework.stereotype.Service;

import com.bell.aqzy.api.model.User;
import com.bell.aqzy.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User getUser(String name, Integer age) {
		User u = new User();
		u.setName(name);
		u.setAge(age);
		return u;
	}

}
