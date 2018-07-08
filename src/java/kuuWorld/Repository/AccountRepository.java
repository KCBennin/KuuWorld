/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuuWorld.Repository;

import java.util.List;
import kuuWorld.SessionBuilder;
import kuuWorld.Entity.AccountEntity;
import kuuWorld.Repository.Interfaces.IRepository;
import org.hibernate.Session;

/**
 *
 * @author kuuku
 */
public class AccountRepository implements IRepository<AccountEntity> {

    private final Session AccountSession;
    
    public AccountRepository() {      
        this.AccountSession = SessionBuilder.InitializeSession();
    }
    
    @Override
    public void AddResource(AccountEntity Entity) {
        if (Entity != null) {
            this.AccountSession.save(Entity);
            this.AccountSession.getTransaction();
        }
    }

    @Override
    public void AddResourceRange(List<AccountEntity> EntityRange) {
       if(EntityRange != null) {
            this.AccountSession.save(EntityRange);
            this.AccountSession.getTransaction().commit();
        }
    }

    @Override
    public void RemoveResource(Integer Id) {     
        AccountEntity Entity = (AccountEntity) this.AccountSession.get(AccountEntity.class, Id);
        this.AccountSession.delete(Entity);
        this.AccountSession.getTransaction();   
    }

    @Override
    public void RemoveResourceRange(List<AccountEntity> EntityRange) {
        
        try  {
            if (EntityRange != null) {
                for (AccountEntity Account:EntityRange) {
                    this.AccountSession.delete(Entity);
                    this.AccountSession.getTransaction();
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public AccountEntity GetEntity(int Id) {
        try {
            AccountEntity Entity = (AccountEntity) this.AccountSession.get(AccountEntity.class, Id);
            return Entity;
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public List<AccountEntity> GetAllResources() {
        List<AccountEntity> Accounts = this.AccountSession.createCriteria(AccountEntity.class).list();
        return Accounts;
    } 
}
