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
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import kuuWorld.Entity.AccountEntity;
import kuuWorld.Repository.AccountRepository;

/**
 * REST Web Service
 *
 * @author kuuku
 */
@Path("Account")
public class AccountResource {

    @Context
    private UriInfo context;
    private final AccountRepository Repository;

    /**
     * Creates a new instance of AccountResource
     */
    public AccountResource() {
        this.Repository = new AccountRepository();
    }

    /**
     * Retrieves representation of an instance of kuuWorld.AccountResource
     * @param Id
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AccountEntity getAccount(@PathParam("Id") Integer Id) {
        AccountEntity Entity = Repository.GetEntity(Id);
        return Entity;
    }
  
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addAccount(AccountEntity Entity) {
        if (Entity != null) {
            this.Repository.AddResource(Entity);
        }
    }
    
}
