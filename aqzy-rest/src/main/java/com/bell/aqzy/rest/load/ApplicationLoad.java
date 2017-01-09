package com.bell.aqzy.rest.load;

import org.glassfish.jersey.server.ResourceConfig;

import com.bell.aqzy.rest.resource.UserResource;

public class ApplicationLoad extends ResourceConfig {
	
	public ApplicationLoad(){
		register(UserResource.class);
		//packages("");
		
		//new AqzyDubboContext("aqzy-rest", "zookeeper://localhost:2181").start();
	}

}
