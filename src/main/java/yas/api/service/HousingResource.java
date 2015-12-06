package main.java.yas.api.service;

import main.java.yas.manager.HousingManager;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by Salman on 11/30/2015.
 */
@Path("/housing")
public class HousingResource {
    @EJB
    private HousingManager manager;

    @GET
    @Path("/new/house")
    public Response createNewHousing_test() {
        String result = manager.createNewHousing();
        return Response.status(200).entity(result).build();
    }
}
