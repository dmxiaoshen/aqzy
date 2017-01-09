package com.bell.aqzy.client.api;

import com.bell.aqzy.api.service.UserService;
import com.bell.common.client.api.AbstractApiHolder;

public class AqzyApiHolder extends AbstractApiHolder {

	public static UserService userService;

	static {
		userService = getBean(UserService.class);
	}

	@Override
	public void showService() {
		System.out.println("--AqzyApiHolder--initialize start");
		printServiceList();
		System.out.println("--AqzyApiHolder--initialize end");
		
		logger.error("--AqzyApiHolder--initialize start");
		logServieList();
		logger.error("--AqzyApiHolder--initialize end");
	}
	
	private void printServiceList(){
		printService("userService");
	}
	
	private void logServieList(){
		logService("userService");
	}
	
}
