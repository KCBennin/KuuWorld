/**
 * Basket Service
 *
 * @author kuuku
 */

 package java.kuuWorld.Service;

import java.kuuWorld.Entity.AccountEntity;
import java.kuuWorld.Entity.BasketEntity;
import kuuWorld.Repository.IRepository;

public class BasketService {

    IRepository<BasketEntity> BasketRepository;

    public AccountEntity GetAccount(int Id) {
        BasketEntity Entity = BasketRepository.GetEntity(Id);
        return Entity;
    }

    public Double CheckValueOfBasket() {
        return null;
    }

    public Integer QuantityOfItemsInBasket() {
        return null;
    }

    public void RemoveAccount(int Id) {
        BasketRepository.RemoveResource(Id);
    }
 }

