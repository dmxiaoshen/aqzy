package com.bell.aqzy.client.api;

import com.bell.aqzy.api.service.UserService;
import com.bell.common.client.api.AbstractApiHolder;

public class AqzyApiHolder extends AbstractApiHolder {

	public static UserService userService;

	static {
		userService = getBean(UserService.class);
		notNull(userService, "AqzyApiHolder->userService must not be null");
		
		showService();
	}
	
	public static void printServiceList(){
		printService("userService");
	}
	
	public static void logServieList(){
		logService("userService");
	}
	
	
	public static void showService() {
		System.out.println("--AqzyApiHolder--dubboContext is--"+dubboContext);
		System.out.println("--AqzyApiHolder--initialize start");
		printServiceList();
		System.out.println("--AqzyApiHolder--initialize end");
		
		logger.error("--AqzyApiHolder--dubboContext is--"+dubboContext);
		logger.error("--AqzyApiHolder--initialize start");
		logServieList();
		logger.error("--AqzyApiHolder--initialize end");
	}
	
}
