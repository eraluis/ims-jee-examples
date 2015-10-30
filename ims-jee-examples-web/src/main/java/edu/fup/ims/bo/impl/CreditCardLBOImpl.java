package edu.fup.ims.bo.impl;

import edu.fup.ims.bo.CreditCardLBO;
import edu.fup.ims.model.CreditCard;
import javax.ejb.Stateless;

/**
*
* @author Luis Eraso
*/
@Stateless
public class CreditCardLBOImpl extends CrudBOImpl<CreditCard> implements CreditCardLBO {
    
    public CreditCardLBOImpl() {
        this(CreditCard.class);
    }

    public CreditCardLBOImpl(Class<CreditCard> entityClass) {
        super(entityClass);
    }


}