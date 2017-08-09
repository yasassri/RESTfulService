package com.mock.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
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

    @POST @Path("/{statusCode}") @Produces(MediaType.TEXT_PLAIN) public Response setStatusCodePost(String x,
            @PathParam("statusCode") String code, @QueryParam("withbody") Boolean withBody) {
        String response = null;
        if (withBody) {
            response = code + " with Body as the respose!";
        }

        if (code.equals("206")) {
            return Response.status(Integer.parseInt(code)).entity(response)
                    .header("Content-Range", "bytes 21010-47021/47022").build();
        } else if (code.equals("300") | code.equals("301") | code.equals("302") | code.equals("303") | code
                .equals("304") | code.equals("306") | code.equals("307")) {
            return Response.status(Integer.parseInt(code)).entity(response)
                    .header("Location", "/RESTfulService/mock/redirect/get")
                    .header("Content-Location", "/RESTfulService/mock/redirect/get").build();
        } else if (code.equals("426")){
            return Response.status(Integer.parseInt(code)).entity(response)
                    .header("Upgrade", "HTTP/2.0")
                    .header("Connection", "Upgrade").build();
        }
        return Response.status(Integer.parseInt(code)).entity(response).build();
    }

    @DELETE @Path("/{statusCode}") @Produces(MediaType.TEXT_PLAIN) public Response setStatusCodeDelete(String x,
            @PathParam("statusCode") String code, @QueryParam("withbody") Boolean withBody) {
        String responseMsg = null;
        if (withBody) {
            responseMsg = code + " with Body as the respose!";
        }
        return Response.status(Integer.parseInt(code)).entity(responseMsg).build();
    }
}
