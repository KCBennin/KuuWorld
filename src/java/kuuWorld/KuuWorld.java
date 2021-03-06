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
@Path("kuuworld")
public class KuuWorld {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of KuuWorld
     */
    public KuuWorld() {
    }

    /**
     * Retrieves representation of an instance of kuuWorld.KuuWorld
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        
        return "<html lang=\"en\"><body><h1>Hello, Kuu World!!</h1></body></html>";
    }

    /**
     * PUT method for updating or creating an instance of KuuWorld
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }  
}
