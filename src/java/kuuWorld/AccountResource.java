/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuuWorld;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author kuuku
 */
@Path("Account")
public class AccountResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AccountResource
     */
    public AccountResource() {
    }

    /**
     * Retrieves representation of an instance of kuuWorld.AccountResource
     * @param Id
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{Id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAccount(Integer Id) {
        //TODO return proper representation object
        
        return "";
    }

    /**
     * PUT method for updating or creating an instance of AccountResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateAccount(String content) {
    }
}
