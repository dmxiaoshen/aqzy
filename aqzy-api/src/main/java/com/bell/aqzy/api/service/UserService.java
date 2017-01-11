package com.bell.aqzy.api.service;

import com.bell.aqzy.api.model.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

	User getUser(String name ,Integer age);
	
	int addUser(String name,Integer age);
	
	PageInfo<User> query(Integer pageNum,Integer pageSize);
}
