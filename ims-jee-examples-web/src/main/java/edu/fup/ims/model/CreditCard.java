package edu.fup.ims.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
*
* @author Luis Eraso
*/
@Entity
public class CreditCard implements Serializable {
    
    private static final long serialVersionUID = -4700465238176510710L;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String expirytDate;
    private Integer controllNumber;
    private String type;
    private double balance;
    
    //Constructor por defecto
    public CreditCard(){
        
    }

    //Constructor con todos los parametros menos id, el cual se genera automaticamente desde la BD
    public CreditCard(String number, String expirytDate, Integer controllNumber, String type, double balance) {
        this.number = number;
        this.expirytDate = expirytDate;
        this.controllNumber = controllNumber;
        this.type = type;
        this.balance = balance;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpirytDate() {
        return expirytDate;
    }

    public void setExpirytDate(String expirytDate) {
        this.expirytDate = expirytDate;
    }

    public Integer getControllNumber() {
        return controllNumber;
    }

    public void setControllNumber(Integer controllNumber) {
        this.controllNumber = controllNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
