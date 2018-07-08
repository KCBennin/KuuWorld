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
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import kuuWorld.Entity.StockEntity;
import kuuWorld.Repository.StockRepository;

/**
 * REST Web Service
 *
 * @author kuuku
 */
@Path("Stock")
public class StockResource {

    @Context
    private UriInfo context;
    private final StockRepository Repository;
    
    /**
     * Creates a new instance of StockResource
     */
    public StockResource() {
        this.Repository = new StockRepository();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public StockEntity getStock(@PathParam("Id") int Id) {
        StockEntity Entity  = this.Repository.GetEntity(Id);
        return Entity;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addStock(StockEntity Entity){
        if(Entity != null) {
            this.Repository.AddResource(Entity);
        }
    }
     
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteStock(@PathParam("Id") int Id){   
        this.Repository.RemoveResource(Id);    
    }
   
}
