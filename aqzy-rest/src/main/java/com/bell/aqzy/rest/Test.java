package com.bell.aqzy.rest;

import com.bell.aqzy.api.model.User;
import com.bell.aqzy.client.api.AqzyApiHolder;
import com.bell.aqzy.client.api.AqzyDubboContext;

public class Test {
	public static void main(String[] args) {
		AqzyDubboContext context = new AqzyDubboContext("ayzy-client", "zookeeper://localhost:2181", "classpath*:dubbo-aqzy-consumer.xml").start();;
		System.out.println(context);
		User u = AqzyApiHolder.userService.getUser("ÀòË¿", 274);
		System.out.println(u.getName()+"---"+u.getAge());
	}
}
