package edu.fup.ims.configuration;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class ApplicationConfig {
	
	private static final String DEFAULT_SERVER = "localhost";
	private static final String DEFAULT_PORT = "8080";
		
	private String server;
	private String port;
	private String serverName;
	
	public ApplicationConfig(){
		this.setServer(DEFAULT_SERVER);
		this.setPort(DEFAULT_PORT);
		this.setServerName( System.getProperty("ServerName") );	
	}
	
	public ApplicationConfig(Properties properties){
		this.setServer(properties.getProperty("config.server"));
		this.setPort(properties.getProperty("config.port"));
		this.setServerName(properties.getProperty("config.serverName"));
	}
	
	@PostConstruct
	private void startup() {  }
	
	@PreDestroy
	private void shutdown() {  }

	//Getters y setters
	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	
}
