package com.mock.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

@Path("/statusCodeService")
public class StatusCodeService {

    @GET
    @Path("/codes/{statusCode}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response setStatusCode(@PathParam("statusCode") String code) {
        return Response.status(Integer.parseInt(code)).entity("Status Sent.").build();
    }
}
