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
        }       
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void RemoveResource(Integer Id) {
        try {
            CustomerEntity Entity = (CustomerEntity) this.CustomerSession.get(CustomerEntity.class,Id);
            this.CustomerSession.delete(Entity);
            this.CustomerSession.getTransaction();
        } 
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void RemoveResourceRange(List<CustomerEntity> EntityRange) {
        try {
            if (EntityRange != null) {
               for(CustomerEntity Customer:EntityRange) {
                   this.CustomerSession.save(Customer);
                   this.CustomerSession.getTransaction();
               }
            }
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public CustomerEntity GetEntity(int Id) {
        try {
            CustomerEntity Entity = (CustomerEntity) this.CustomerSession.get(CustomerEntity.class, Id);
            return Entity;
        }         
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public List<CustomerEntity> GetAllResources() {
        try {
            List<CustomerEntity> Customers = this.CustomerSession.createCriteria(CustomerEntity.class).list();
            return Customers;
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }  
}
