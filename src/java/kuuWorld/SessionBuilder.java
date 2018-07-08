/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuuWorld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author kuuku
 */
public class SessionBuilder {
    
    public static Session InitializeSession(){
        final Configuration Configuration = new Configuration().configure();
        final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(Configuration.getProperties());
        
        final SessionFactory Factory = Configuration.buildSessionFactory(builder.build());
        final Session FactorySession = Factory.openSession();
               
        return FactorySession;
    }  
}
