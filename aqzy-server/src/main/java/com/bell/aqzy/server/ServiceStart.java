package com.bell.aqzy.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ServiceStart {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"dubbo-aqzy-provider.xml");
		// applicationContext.registerShutdownHook();
		applicationContext.start();
		System.out.println("---start---");
		while (true) {
			Thread.sleep(1000);
		}
	}
}
