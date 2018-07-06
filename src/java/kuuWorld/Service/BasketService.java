/**
 * Basket Service
 *
 * @author kuuku
 */

 package kuuWorld.Service;

import kuuWorld.Entity.BasketEntity;
import kuuWorld.Repository.IRepository;

public class BasketService {

    IRepository<BasketEntity> BasketRepository;

    public BasketService(IRepository<BasketEntity> BasketRepository) {
        this.BasketRepository = BasketRepository;
    }
    
    public BasketEntity GetAccount(int Id) {
        BasketEntity Entity = BasketRepository.GetEntity(Id);
        return Entity;
    }

    public Double CheckValueOfBasket() {
        return null;
    }

    public Integer QuantityOfItemsInBasket() {
        return null;
    }
    
    public void InitiateCheckout(){
        
    }

    public void RemoveItemFromBasket(int Id) {
        BasketRepository.RemoveResource(Id);
    }
 }

