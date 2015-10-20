package edu.fup.ims.services;

import edu.fup.ims.bo.CreditCardLBO;
import edu.fup.ims.bo.TransactionLBO;
import edu.fup.ims.model.CreditCard;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author Luis Eraso
 */
@Stateless
@WebService
public class CreditCardSoap {
       	
    @Inject CreditCardLBO creditCardLBO;
    @Inject TransactionLBO transactionLBO;
    
    public String createCreditCard(String number, String expirytDate, Integer controllNumber, String type, double balance){
        CreditCard creditCard = new CreditCard(number, expirytDate, controllNumber, type, balance);        
        creditCardLBO.add(creditCard);        
        return creditCard.getNumber();
        
    }
    
    public double getCreditCardBalance(String number){         
        // TODO Implementar función en CreditCardBOImpl
        return 2000000.0;
    }
    
    public String createTransaction(long creditCardId, double transactionValue){
        
        CreditCard creditCard = new CreditCard();
        String result = transactionLBO.createTransaction(creditCard, transactionValue);
        return result;

    }
    
}
