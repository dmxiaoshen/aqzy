package com.bell.aqzy.client.api;

import com.bell.common.client.context.AbstractDubboContext;

public class AqzyDubboContext extends AbstractDubboContext{

	public AqzyDubboContext(String appName, String zkAddress, String configPath) {
		super(appName,zkAddress,configPath);
	}
	
	public AqzyDubboContext start(){
		init();
		return this;
	}
}
