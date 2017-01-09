package com.bell.aqzy.client.api;

import com.bell.common.client.context.AbstractDubboContext;

public class AqzyDubboContext extends AbstractDubboContext{
	 private static final String CONFIG = "classpath*:dubbo-aqzy-consumer.xml";

	public AqzyDubboContext(String appName, String zkAddress){
		this(appName, zkAddress, CONFIG);
	}
	
	public AqzyDubboContext(String appName, String zkAddress, String configPath) {
		super(appName,zkAddress,configPath);
	}
	
	public AqzyDubboContext start(){
		init();
		new AqzyApiHolder().showService();
		return this;
	}
}
