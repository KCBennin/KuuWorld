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
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import kuuWorld.Repository.CustomerRepository;

/**
 * REST Web Service
 *
 * @author kuuku
 */

@Path("Customer")
public class CustomerResource {

    @Context
    private UriInfo context;
    private CustomerRepository Repository;
        
    /**
     * Creates a new instance of CustomerResource
     */
    public CustomerResource() {
        this.Repository = new CustomerRepository();
    }

    /**
     * Retrieves representation of an instance of kuuWorld.CustomerResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerEntity getCustomer(@PathParam("Id") Integer Id) {
        CustomerEntity Entity = this.Repository.GetEntity(Id);
        return Entity;
    }
   
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteCustomer(@PathParam("Id") Integer Id){
        this.Repository.RemoveResource(Id);        
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void addCustomer(CustomerEntity Customer) {
        this.Repository.AddResource(Customer);
    }
}
