package com.mock.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/redirect") public class RedirectService {

    @GET @Path("get") public Response getMsg() {

        String output = "Redirect Message";
        return Response.status(200).entity(output).build();
    }

    @POST @Path("get") public Response postMsg() {

        String output = "Redirect Message";
        return Response.status(200).entity(output).build();
    }
}
