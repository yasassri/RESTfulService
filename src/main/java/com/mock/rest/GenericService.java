package com.mock.rest;

import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/service") public class GenericService {

    @GET @Path("/get") public Response getMsg() {
        String output = "Get Request Received";
        return Response.status(200).entity(output).build();

    }

    @HEAD @Path("/head") public Response headMsg() {
        String output = "Get Request Received";
        return Response.status(200).entity(output).header("custom", "head request received").build();

    }

    @POST @Produces("application/json") @Path("/post") public Response postMsg() {
        return Response.status(200).entity("{\"POST Method:Request Status\":\"Sucess\"}").build();

    }

    @PUT @Produces("application/json") @Path("/put") public Response putMsg() {
        return Response.status(200).entity("{\"PUT Method:Request Status\":\"Sucess\"}").build();

    }
}
