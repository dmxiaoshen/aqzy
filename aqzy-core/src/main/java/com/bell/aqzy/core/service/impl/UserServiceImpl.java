package com.bell.aqzy.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bell.aqzy.api.model.User;
import com.bell.aqzy.api.service.UserService;
import com.bell.aqzy.core.dao.UserDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public User getUser(String name, Integer age) {
		User u = new User();
		u.setName(name);
		u.setAge(age);
		return u;
	}

	@Override
	public int addUser(String name, Integer age) {
		User u = new User();
		u.setName(name);
		u.setAge(age);
		return userDao.insert(u);
	}

	@Override
	public PageInfo<User> query(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<User>(userDao.query());
	}

}
