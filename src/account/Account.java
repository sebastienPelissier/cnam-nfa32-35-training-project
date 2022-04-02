package account;

import java.util.UUID;

public class Account {
    int accountId;
    String accountUuid;
    float balance = 0 ;
    String lastname;
    String firstname;

    public int getId(){
        return this.accountId;
    }

    public String getUuid(){
        return this.accountUuid;
    }

    public float getBalance(){
        return this.balance;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getFullname(){
        return this.firstname + " " + this.lastname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setId(){
        this.accountId = (int) Math.random();
    }

    private void setUuid(){
        this.accountUuid = this.generatorUUID();
    }

    private String generatorUUID(){
        return UUID.randomUUID().toString();
    }
}
