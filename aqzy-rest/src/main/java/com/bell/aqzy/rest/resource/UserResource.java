package com.bell.aqzy.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.bell.aqzy.api.model.User;
import com.bell.aqzy.api.service.UserService;
import com.bell.aqzy.client.api.AqzyApiHolder;
import com.bell.common.base.redis.client.RedisClientTemplate;
import com.bell.common.base.spring.SpringContextHolder;
import com.bell.common.rest.resource.AbstractResource;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Path("user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource extends AbstractResource{
	
	private RedisClientTemplate redisClientTemplate=SpringContextHolder.getBean(RedisClientTemplate.class);
	
	public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();

    public static final Gson GSONIGNORENULL = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	
    @GET
    @Path("/query")
	public Response queryUser(@QueryParam("name")String name){
		User u = new User();
		u.setName(name);
		u.setAge(33);
		UserService userService = AqzyApiHolder.userService;
		User k = userService.getUser("李强", 29);
		//userService.addUser(name, 19);
		//userService.addUser("扬州", 21);
		PageInfo<User> result = userService.query(1, 5);
		String str = redisClientTemplate.get("foo");
		String s = redisClientTemplate.get("fk");
		System.out.println(str+"-"+s);
		result.setOrderBy(str);
		return Response.status(Status.OK).type(MediaType.APPLICATION_JSON).entity(GSON.toJson(result)).build();
	}
    
   /* public Response addUser(){
    	
    }*/

}
