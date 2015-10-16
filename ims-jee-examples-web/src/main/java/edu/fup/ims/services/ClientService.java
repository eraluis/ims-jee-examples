package edu.fup.ims.services;

import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import edu.fup.ims.bo.ClientLBO;
import edu.fup.ims.bo.CreditCardLBO;
import edu.fup.ims.commons.ApplicationException;
import edu.fup.ims.model.Client;


/**
*
* @author Luis Eraso
*/
@Stateless
@WebService
public class ClientService {
    
    @Inject CreditCardLBO creditCardBO;
    @Inject ClientLBO clientLBO;
    
    public void createClient(String firstName, String lastName, Date birthday, String address) {
        Client client = new Client(firstName, lastName, birthday, address);
        clientLBO.add(client);        
    }
    
    /*
    public void createClient(Client client) throws ApplicationException {
        if(client.getId() != null){
        	throw new ApplicationException("APP-CL-01 Client already exists");        
        }
        clientLBO.add(client);        
    }
     */
}
