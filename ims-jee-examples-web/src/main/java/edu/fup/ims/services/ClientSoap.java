package edu.fup.ims.services;

import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import edu.fup.ims.bo.ClientLBO;
import edu.fup.ims.bo.CreditCardLBO;
import edu.fup.ims.model.Client;

/**
 *
 * @author Luis Eraso
 */
    @Stateless
    @WebService
    public class ClientSoap {

        @Inject CreditCardLBO creditCardBO;
        @Inject ClientLBO clientLBO;

        public void createClient(String firstName) {
            Client client = new Client(firstName);
            clientLBO.add(client);
        }
    }
