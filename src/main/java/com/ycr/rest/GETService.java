package com.ycr.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/getservice")
public class GETService {

	static int requestCounter = 0;
 
	@GET
	@Path("get/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Get Request Recieved with Param " + msg;
		requestCounter++;
		return Response.status(200).entity(output).build();
 
	}

	@GET
	@Produces("application/json")
	@Path("/requestcount")
	public Response getRequestCount(){
		return Response.status(200).entity("{\"No of Get Requests\" : " +String.valueOf(requestCounter)+ "}").build();

	}

	@GET
	@Produces("application/json")
	@Path("/resetrequestcount")
	public Response resetRequestCount(){
		requestCounter =0;
		return Response.status(200).entity("{\"Request Count is Set to \" : " +String.valueOf(requestCounter)+ "}").build();

	}
}