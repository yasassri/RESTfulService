package com.mock.rest;

import javax.ws.rs.DELETE;
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

    @GET @Produces("application/json") @Path("/all") public Response allMsg() {
        return Response.status(200).entity("{\"GET Method:Request Status\":\"Sucess\"}").build();
    }

    @PUT @Produces("application/json") @Path("/all") public Response allMsgPut() {
        return Response.status(200).entity("{\"GET Method:Request Status\":\"Sucess\"}").build();
    }

    @POST @Produces("application/json") @Path("/all") public Response allMsgPost() {
        return Response.status(200).entity("{\"POST Method:Request Status\":\"Sucess\"}").build();
    }

    @DELETE @Produces("application/json") @Path("/all") public Response allMsgDelete() {
        return Response.status(200).entity("{\"DELETE Method:Request Status\":\"Sucess\"}").build();
    }
}
