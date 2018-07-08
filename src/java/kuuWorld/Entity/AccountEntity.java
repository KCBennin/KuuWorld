package kuuWorld.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="Account")
 public class AccountEntity {

    public AccountEntity(String FirstName, String SecondName) {
        this.FirstName = FirstName;
        this.SecondName = SecondName;
    }
     
    @Id
    public int Id;

    public String FirstName;

    public String SecondName;

    public String PostCode;
    
    public Double Balance;

 }