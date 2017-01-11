package com.bell.aqzy.core.dao;

import java.util.List;

import com.bell.aqzy.api.model.User;

public interface UserDao {
    int insert(User record);

    int insertSelective(User record);

	List<User> query();
}