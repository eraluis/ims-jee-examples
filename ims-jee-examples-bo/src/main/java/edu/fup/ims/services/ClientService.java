package edu.fup.ims.services;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import edu.fup.ims.bo.ClientBO;
import edu.fup.ims.bo.CreditCardBO;
import edu.fup.ims.model.Client;

/**
*
* @author Luis Eraso
*/
@Stateless
@WebService
public class ClientService {
    
    @Inject CreditCardBO creditCardBO;
    @Inject ClientBO clientBO;
    
    public void createClient() {
        Client client = new Client();
        clientBO.add(client);
    }

}
