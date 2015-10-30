package edu.fup.ims.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import edu.fup.ims.bo.ClientLBO;
import edu.fup.ims.configuration.ApplicationConfig;
import edu.fup.ims.model.Client;

@ManagedBean
@ViewScoped
public class ClientBean {
    
    // ejbs inyectados
    @Inject private ApplicationConfig appConfig;
    @Inject private ClientLBO clientLBO;

    // atributos 
    private Client client;
    private List<Client> listClient;

    public ClientBean() {
        //init();
    }

    @PostConstruct
    public void construct() {
        init();
    }

    public void init() {
        client = new Client();
        listClient = clientLBO.findAll();

        if (listClient == null) {
            System.out.println("listClient is null");
            listClient = new ArrayList<>();
        }
    }
    
    public String addClient() {
        clientLBO.add(client); // Agregar cliente a BD
        listClient.add(client); // Agregar cliente a interfaz pagina web
        System.out.println("Client added with id: " + client.getId());
        client = new Client();
        return null;
    }

    //Getters and setters...
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Client> getListClient() {
        return listClient;
    }

    public void setListClient(List<Client> listClient) {
        this.listClient = listClient;
    }

    public ApplicationConfig getAppConfig() {
        return appConfig;
    }

    public void setAppConfig(ApplicationConfig appConfig) {
        this.appConfig = appConfig;
    }

}
