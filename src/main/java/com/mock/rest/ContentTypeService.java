package com.mock.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/contentTypeService")
public class ContentTypeService {

    @POST
    @Path("/contentType")
    public Response setContentType(@Context HttpHeaders headers, String msg) {
        MediaType mediaType = headers.getMediaType();
        System.out.println(msg);
        return Response.status(200).entity(msg).type(mediaType).build();
    }
}
