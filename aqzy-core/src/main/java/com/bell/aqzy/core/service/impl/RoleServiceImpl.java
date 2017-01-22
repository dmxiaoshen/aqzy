package com.bell.aqzy.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bell.aqzy.api.model.Role;
import com.bell.aqzy.api.service.RoleService;
import com.bell.aqzy.core.dao.RoleDao;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;

	@Override
	public int addRole(Role role) {
		return roleDao.insertSelective(role);
	}

	@Override
	public Role queryRole(String id) {
		return roleDao.selectByPrimaryKey(id);
	}

	@Override
	public int deleteRole(String id) {
		return roleDao.deleteByPrimaryKey(id);
	}

	@Override
	public int updateRole(Role role) {
		return roleDao.updateByPrimaryKeySelective(role);
	}

}
