/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuuWorld;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author kuuku
 */
@javax.ws.rs.ApplicationPath("Api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(kuuWorld.AccountResource.class);
        resources.add(kuuWorld.BasketResource.class);
        resources.add(kuuWorld.CheckoutResource.class);
        resources.add(kuuWorld.CustomerResource.class);
        resources.add(kuuWorld.KuuWorld.class);
        resources.add(kuuWorld.StockResource.class);
    }
    
}
