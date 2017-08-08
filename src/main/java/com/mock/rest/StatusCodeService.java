package com.mock.rest;

import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/statusCodeService") public class StatusCodeService {

    @GET @Path("/{statusCode}") @Produces(MediaType.TEXT_PLAIN) public Response setStatusCodeGet(
            @PathParam("statusCode") String code, @QueryParam("withbody") Boolean withBody) {
        String response = null;
        if (withBody) {
            response = code + " with Body as the respose!";
        }
        return Response.status(Integer.parseInt(code)).entity(response).build();
    }

    @HEAD @Path("/{statusCode}") @Produces(MediaType.TEXT_PLAIN) public Response setStatusCodeHead(
            @PathParam("statusCode") String code) {
        String response = null;
        return Response.status(Integer.parseInt(code)).entity(response).build();
    }
}
