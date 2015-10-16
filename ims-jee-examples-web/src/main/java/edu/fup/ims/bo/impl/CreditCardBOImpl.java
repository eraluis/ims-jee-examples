package edu.fup.ims.bo.impl;

import edu.fup.ims.bo.CreditCardLBO;
import edu.fup.ims.model.CreditCard;
import javax.ejb.Stateless;

/**
*
* @author Luis Eraso
*/
@Stateless
public class CreditCardBOImpl extends CrudBOImpl<CreditCard> implements CreditCardLBO {
    
    public CreditCardBOImpl() {
        this(CreditCard.class);
    }

    public CreditCardBOImpl(Class<CreditCard> entityClass) {
        super(entityClass);
    }


}