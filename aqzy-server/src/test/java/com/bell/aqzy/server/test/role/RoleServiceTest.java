package com.bell.aqzy.server.test.role;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.bell.aqzy.api.model.Role;
import com.bell.aqzy.api.service.RoleService;
import com.bell.aqzy.server.test.BaseTest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class RoleServiceTest extends BaseTest{
	
	public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();
	
	public static final Gson GSONIGNORENULL = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	
	public static final Gson GS = new GsonBuilder().create();
	
	 public static final Gson GSON4DATE = new GsonBuilder().registerTypeAdapter(Date.class, new DateMutualLong()).create();

	    public static class DateMutualLong implements JsonSerializer<Date>, JsonDeserializer<Date> {

	        public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
	            return new JsonPrimitive(src.getTime());
	        }

	        public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
	            return new Date(json.getAsJsonPrimitive().getAsLong());
	        }

	    }
	
	@Autowired
	private RoleService roleService;
	
	
	@Test
	@Rollback(value=false)
	public void add(){
		Role role = new Role();
		role.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		role.setCode("car");
		role.setName("洗车员");
		role.setDescription("洗车员");
		role.setSort(0);
		role.setDelFlag(false);
		Date now = new Date();
		role.setCreateTime(now);
		role.setUpdateTime(now);
		roleService.addRole(role);
	}
	
	@Test
	public void query(){
		Role r = roleService.queryRole("76af52a01625494ca8043445338189bc");
		System.out.println(GSON.toJson(r));
		System.out.println(GSONIGNORENULL.toJson(r));
		System.out.println(GS.toJson(r));
		System.out.println(GSON4DATE.toJson(r));
	}
	
	@Test
	@Rollback(value=false)
	public void delete(){
		
	}
	
	@Test
	@Rollback(value=false)
	public void update(){
		Role r = new Role();
		r.setId("76af52a01625494ca8043445338189bc");
		r.setRemarks("我是remarks");
		roleService.updateRole(r);
		
	}

}
