package com.bell.aqzy.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AqzyService {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath*:config/dubbo-aqzy-server.xml");
		// applicationContext.registerShutdownHook();
		applicationContext.start();
		System.out.println("---start---");
		while (true) {
			Thread.sleep(1000);
		}
	}
}
