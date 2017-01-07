package com.bell.aqzy.client.api;

import com.bell.aqzy.api.service.UserService;
import com.bell.common.client.api.AbstractApiHolder;

public class AqzyApiHolder extends AbstractApiHolder {

	public static UserService userService;

	static {
		userService = getBean(UserService.class);
	}
}
