package edu.fup.ims.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class SesionBean {

    //atributos (Variables de instancia) 
    private String tipo = "Bean de sesión";
    private int numeroDeLlamadas = 0;
    private List<String> clientes = new ArrayList<>();
    private String clienteActual = "";

    //Contructor por defecto
    public SesionBean() {

    }

    public String prueba() {
        System.out.println("prueba()...");

        String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
        System.out.println("path: " +path);
               
        Path filePath = Paths.get(path+"/resources/prueba.txt");

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            System.out.println("Funciona: "+reader.readLine());          
        } catch (IOException e) {
            System.err.println("Error while opening " + filePath.toUri());

        }

        return null;
    }
    
    public String prueba2(){
        System.out.println("prueba2()...");
        
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        InputStream input = externalContext.getResourceAsStream("/resources/prueba.txt");
        
        BufferedReader  reader = new BufferedReader(new InputStreamReader(input));
        try {
            System.out.println("Funciona: "+reader.readLine());   
        } catch (IOException ex) {
            Logger.getLogger(SesionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Un metodo
    public String agregarCliente() {
        System.out.println("agregarCliente()...");

        //Verificar que el cliente actual no este vacia.
        if (clienteActual != null && !"".equals(clienteActual.trim())) {
            clientes.add(clienteActual);
            numeroDeLlamadas++;
            System.out.println("clientes: " + clientes.size());
        }

        clienteActual = "";
        return null;
    }

    //Getters and setters...
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDeLlamadas() {
        return numeroDeLlamadas;
    }

    public void setNumeroDeLlamadas(int numeroDeLlamadas) {
        this.numeroDeLlamadas = numeroDeLlamadas;
    }

    public List<String> getClientes() {
        return clientes;
    }

    public void setClientes(List<String> clientes) {
        this.clientes = clientes;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

}
