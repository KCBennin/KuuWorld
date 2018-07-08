/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuuWorld.Repository;

import java.util.List;
import kuuWorld.Entity.CustomerEntity;
import kuuWorld.Repository.Interfaces.IRepository;
import org.hibernate.Session;
import kuuWorld.SessionBuilder;

/**
 *
 * @author kuuku
 */
public class CustomerRepository implements IRepository<CustomerEntity> 
{
    private final Session CustomerSession;
    public CustomerRepository() {
        this.CustomerSession = SessionBuilder.IntializeSession();
    }

    @Override
    public void AddResource(CustomerEntity Entity) {       
        try {
            if (Entity != null) {
                this.CustomerSession.save(Entity);
                this.CustomerSession.getTransaction();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void AddResourceRange(List<CustomerEntity> EntityRange) {
        try {
            if (EntityRange != null) {
                for (CustomerEntity Customer:EntityRange){
                    this.CustomerSession.save(Customer);
                    this.CustomerSession.getTransaction();
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void RemoveResource(Integer Id) {
        CustomerEntity Entity = (CustomerEntity) this.CustomerSession.get(CustomerEntity.class,Id);
        this.CustomerSession.delete(Entity);
        this.CustomerSession.getTransaction();
    }

    @Override
    public void RemoveResourceRange(List<CustomerEntity> EntityRange) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerEntity GetEntity(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerEntity> GetAllResources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
