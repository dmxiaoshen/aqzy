package com.bell.aqzy.api.service;

import com.bell.aqzy.api.model.Role;

public interface RoleService {

	 int addRole(Role role);
	 
	 Role queryRole(String id);
	 
	 int deleteRole(String id);
	 
	 int updateRole(Role role);
}
