package edu.fup.ims.controllers;

import edu.fup.ims.bo.PeliculaLBO;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import edu.fup.ims.model.Pelicula;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

@ManagedBean
@ViewScoped // Otras opciones son: @RequestScoped, @SessionScoped, @ApplicationScoped
public class PeliculasBean {

    // ejbs inyectados
    @Inject
    PeliculaLBO peliculaLBO;

    // atributos
    List<Pelicula> listaPeliculas = new ArrayList<>();
    Pelicula peliculaActual = new Pelicula();

    //constructor por defecto
    public PeliculasBean() {
    }
    
    @PostConstruct
    public void construct() {
        init();
    }

    public void init() {
        peliculaActual = new Pelicula();
        listaPeliculas = peliculaLBO.findAll();

        if (listaPeliculas == null) {
            System.out.println("listaPeliculas is null");
            listaPeliculas = new ArrayList<>();
        }
    }

    //acciones de botones
    public String agregarPelicula() {

        peliculaLBO.add(peliculaActual); // Agregar pelicula a BD
        listaPeliculas.add(peliculaActual); // Agregar pelicula a interfaz web
        System.out.println("Pelicula agregada con id: " + peliculaActual.getId());
        peliculaActual = new Pelicula(); //con esta instruccion limipo los cuadros de texto de la pagina web		
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
