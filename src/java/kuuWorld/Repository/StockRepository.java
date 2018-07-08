/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuuWorld.Repository;

import java.util.List;
import kuuWorld.SessionBuilder;
import kuuWorld.Entity.StockEntity;
import kuuWorld.Repository.Interfaces.IRepository;
import org.hibernate.Session;

/**
 *
 * @author kuuku
 */
public class StockRepository implements IRepository<StockEntity> {

    private final Session StockSession;

    public StockRepository(){
        this.StockSession = SessionBuilder.InitializeSession();
    }
    
    @Override
    public void AddResource(StockEntity Entity) {        
        try  {       
            if (Entity != null) {
                this.StockSession.save(Entity);
                this.StockSession.getTransaction();
            } 
        } catch(Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void AddResourceRange(List<StockEntity> EntityRange) {      
        try  { 
            if (EntityRange != null) {
                this.StockSession.save(EntityRange);
                this.StockSession.getTransaction().commit();
            } 
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void RemoveResource(Integer Id) {
        try {
            StockEntity Entity = (StockEntity) this.StockSession.get(AccountEntity.class, Id);
            this.StockSession.save(Entity);
            this.StockSession.getTransaction(); 
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void RemoveResourceRange(List<StockEntity> EntityRange) {
        try  {
            if (EntityRange != null) {
                for (StockEntity Stock:EntityRange) {
                    this.StockSession.delete(Stock);
                    this.StockSession.getTransaction();
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public StockEntity GetEntity(int Id) {
        try {
            StockEntity Entity = (StockEntity) this.StockSession.get(StockEntity.class, Id);
            return Entity;
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public List<StockEntity> GetAllResources() {
        try {
            List<StockEntity> Stocks = this.StockSession.createCriteria(StockEntity.class).list();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return Stocks;
    }
    
}
