package edu.fup.ims.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.fup.ims.model.Pelicula;

@ManagedBean
@SessionScoped
public class PeliculasBean {
	
	//atributos
	List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
	Pelicula peliculaActual = new Pelicula();
		
	//constructor por defecto
	public PeliculasBean(){	}
	
	//acciones de botones
	public String agregarPelicula(){
		
		listaPeliculas.add(peliculaActual);
		peliculaActual = new Pelicula();
		
		return null;
	}

	//Getters and setters...
	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

	public Pelicula getPeliculaActual() {
		return peliculaActual;
	}

	public void setPeliculaActual(Pelicula peliculaActual) {
		this.peliculaActual = peliculaActual;
	}
		
}
