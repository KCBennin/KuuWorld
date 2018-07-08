/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuuWorld;

import kuuWorld.Entity.CustomerEntity;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.hibernate.cfg.Configuration;

/**
 * REST Web Service
 *
 * @author kuuku
 */
@Path("Customer")
public class CustomerResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CustomerResource
     */
    public CustomerResource() {
        final Configuration configuration = new Configuration().configure();
    }

    /**
     * Retrieves representation of an instance of kuuWorld.CustomerResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getCustomer() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of CustomerResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateCustomer(CustomerEntity content) {
        
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteCustomer(CustomerEntity Customer){
        
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void addCustomer(CustomerEntity Customer) {
        
    }
}
