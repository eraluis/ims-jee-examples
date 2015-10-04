package edu.fup.ims.bo.impl;

import edu.fup.ims.bo.CreditCardBO;
import edu.fup.ims.model.CreditCard;
import javax.ejb.Stateless;

/**
*
* @author Luis Eraso
*/
@Stateless
public class CreditCardBOImpl extends CrudBOImpl<CreditCard> implements CreditCardBO {
    
    public CreditCardBOImpl() {
        this(CreditCard.class);
    }

    public CreditCardBOImpl(Class<CreditCard> entityClass) {
        super(entityClass);
    }


}