package edu.fup.ims.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.fup.ims.bo.ClientLBO;
import edu.fup.ims.configuration.ApplicationConfig;
import edu.fup.ims.model.Client;

@ManagedBean
@ViewScoped
public class ClientBean {

	@Inject private ApplicationConfig appConfig;
	@Inject private ClientLBO clientLBO;
		
	private Client client;
	private List<Client> listClient;
	
	public ClientBean() {
		//init();
	}
	
	@PostConstruct
	public void construct(){
		init();
	}
	
	public void init(){
		client = new Client();
		listClient = clientLBO.findAll();
				
		if(listClient == null){
			System.out.println("listClient is null");
			listClient = new ArrayList<Client>();
		}
	}
	
	public String addClient(){		
		clientLBO.add(client);
		listClient.add(client);
		System.out.println("Client added with id: "+ client.getId());
		client = new Client();
		return null;
	}
	
	
	public String testServerName(){
		String uno = System.getProperty("jboss.server.name");
		String dos = System.getProperty("ServerName");
		String tres = null;
		
		InitialContext ic;
		try {
			ic = new javax.naming.InitialContext();
			tres = ic.lookup("servername").toString();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("uno: "+uno);
		System.out.println("dos: "+dos);
		System.out.println("tres: "+tres);	

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
