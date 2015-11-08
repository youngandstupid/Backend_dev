package main.java.yas.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by Salman on 11/5/2015.
 */
@Path("/hello")
public class UserResource {
    @GET
    @Path("/{param}")
    public Response getMsg( @PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }
}
