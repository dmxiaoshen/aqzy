package com.bell.aqzy.server.test.redis;

import org.junit.Test;

import com.bell.aqzy.server.test.BaseTest;
import com.bell.common.base.redis.client.RedisClientTemplate;
import com.bell.common.base.spring.SpringContextHolder;

public class RedisTest extends BaseTest{
	
	//@Autowired
	//private RedisClientTemplate redisClientTemplate;
	
	@Test
	public void test(){
		RedisClientTemplate redisClientTemplate=SpringContextHolder.getBean(RedisClientTemplate.class);
		String str = redisClientTemplate.get("foo");
		String s = redisClientTemplate.get("fk");
		redisClientTemplate.set("ak", "222");
		System.out.println("-------------"+str);
		System.out.println("-------------"+s);
	}

}
