package edu.fup.ims.bo.impl;

import javax.ejb.Stateless;

import edu.fup.ims.bo.ClientLBO;
import edu.fup.ims.model.Client;

/**
*
* @author Luis Eraso
*/
@Stateless
public class ClientLBOImpl extends CrudBOImpl<Client> implements ClientLBO {

    public ClientLBOImpl(){
      this(Client.class);  
    }
    
    public ClientLBOImpl(Class<Client> entityClass) {
        super(entityClass);
    }

}
