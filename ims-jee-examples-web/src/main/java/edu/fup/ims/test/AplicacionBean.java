package edu.fup.ims.test;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class AplicacionBean {

	//atributos (Variables de instancia) 
	private String tipo = "Bean de aplicación";
	private int numeroDeLlamadas = 0;
	private List<String> clientes = new ArrayList<>();
	private String clienteActual = "";
	
	//Contructor por defecto
	public AplicacionBean(){

	}
	
	//Un metodo
	public String agregarCliente(){
		System.out.println("agregarCliente()...");
		
		//Verificar que el cliente actual no este vacia.
		if( clienteActual !=null && !"".equals(clienteActual.trim()) ){
			clientes.add(clienteActual);
			numeroDeLlamadas++;
			System.out.println("clientes: "+ clientes.size());
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
