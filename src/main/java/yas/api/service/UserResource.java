package main.java.yas.api.service;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import main.java.yas.manager.UserManager;
import main.java.yas.to.UserTO;

/**
 * Created by Salman on 11/5/2015.
 */
@Path("/user")
public class UserResource {
    @EJB
    private UserManager manager;
    @GET
    @Path("/{param}")
    public Response getMsg( @PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/new/{name}")
    public Response createUser_test( @PathParam("name") String name) {
        UserService service = new UserService();
        String result = service.createNewUser_test(name , manager);
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/read")
    public Response readUser_test( @PathParam("name") String name) {

        String userName = UserService.readUser_test(manager);
        return Response.status(200).entity(userName).build();
    }

}
