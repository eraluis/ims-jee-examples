package edu.fup.ims.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1189399048888918705L;

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int anio;
    private int duracion;
    private String pais;

    @ManyToOne
    @JoinColumn(name = "fk_genero")
    private Genero genero;

    //constructor por defecto
    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, int duracion, String pais, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.duracion = duracion;
        this.pais = pais;
        this.genero = genero;
    }

    //Getters y setters...
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

}
