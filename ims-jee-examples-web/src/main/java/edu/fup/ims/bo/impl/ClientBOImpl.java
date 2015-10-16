package edu.fup.ims.bo.impl;

import javax.ejb.Stateless;

import edu.fup.ims.bo.ClientLBO;
import edu.fup.ims.model.Client;

/**
*
* @author Luis Eraso
*/
@Stateless
public class ClientBOImpl extends CrudBOImpl<Client> implements ClientLBO {

    public ClientBOImpl(){
      this(Client.class);  
    }
    
    public ClientBOImpl(Class<Client> entityClass) {
        super(entityClass);
    }

}
