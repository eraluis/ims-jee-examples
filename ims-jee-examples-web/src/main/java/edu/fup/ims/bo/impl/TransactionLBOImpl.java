package edu.fup.ims.bo.impl;

import edu.fup.ims.bo.TransactionLBO;
import edu.fup.ims.model.CreditCard;
import edu.fup.ims.model.Transaction;
import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author Luis Eraso
 */
@Stateless
public class TransactionLBOImpl extends CrudBOImpl<Transaction> implements TransactionLBO {

    public TransactionLBOImpl(){
      this(Transaction.class);  
    }
    
    public TransactionLBOImpl(Class<Transaction> entityClass) {
        super(entityClass);
    }

    @Override
    public String createTransaction(CreditCard creditCard, double value){
        
    	// TODO Add transaction to CreditCard
        Transaction trans1 = new Transaction( new Date(),value);
        
        trans1 = this.add(trans1);
        if( trans1.getId()!= null){
            return " 211 - transaction  created correctly";
        }
        else {
            return " 511 - transaction not created correctly";        
        }
    }
    
}