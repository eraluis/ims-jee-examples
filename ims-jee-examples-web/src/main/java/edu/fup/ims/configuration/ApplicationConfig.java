package edu.fup.ims.configuration;

import java.util.Properties;

public class ApplicationConfig {
	
	private static final String DEFAULT_SERVER = "localhost";
	private static final String DEFAULT_PORT = "8080";
	
	private String server;
	private String port;
	
	public ApplicationConfig(){
		this.setServer(DEFAULT_SERVER);
		this.setPort(DEFAULT_PORT);
	}
	
	public ApplicationConfig(Properties properties){
		this.setServer(properties.getProperty("config.server"));
		this.setPort(properties.getProperty("config.port"));
	}

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

	
}
