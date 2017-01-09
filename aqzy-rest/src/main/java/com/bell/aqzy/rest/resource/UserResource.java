package com.bell.aqzy.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.bell.aqzy.api.model.User;
import com.bell.aqzy.api.service.UserService;
import com.bell.aqzy.client.api.AqzyApiHolder;
import com.bell.common.rest.resource.AbstractResource;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Path("user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource extends AbstractResource{
	
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
		return Response.status(Status.OK).type(MediaType.APPLICATION_JSON).entity(GSON.toJson(k)).build();
	}

}
