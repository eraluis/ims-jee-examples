package edu.fup.ims.configuration;

import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class ApplicationConfig {

    private static final String DEFAULT_SERVER = "localhost";
    private static final String DEFAULT_PORT = "8080";

    private String server;
    private String port;

    public ApplicationConfig() {
        this.server = DEFAULT_SERVER;
        this.port = DEFAULT_PORT;
    }

    public ApplicationConfig(Properties properties) {
        this.server = properties.getProperty("config.server");
        this.port = properties.getProperty("config.port");
    }

    @PostConstruct
    private void startup() {
    }

    @PreDestroy
    private void shutdown() {
    }

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

}
