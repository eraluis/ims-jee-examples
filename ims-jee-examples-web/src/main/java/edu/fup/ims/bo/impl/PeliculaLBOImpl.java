/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fup.ims.bo.impl;

import edu.fup.ims.bo.PeliculaLBO;
import edu.fup.ims.model.Pelicula;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Luis Eraso
 */
@Stateless
public class PeliculaLBOImpl extends CrudBOImpl<Pelicula> implements PeliculaLBO {
    
    public PeliculaLBOImpl() {
        this(Pelicula.class);
    }

    public PeliculaLBOImpl(Class<Pelicula> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Pelicula> listarPeliculas() {
        return findAll();
    }

    @Override
    public Pelicula crearPelicula(String nombre, int anio) {
        Pelicula nuevoObjeto = new Pelicula();        
        nuevoObjeto.setTitulo(nombre);
        nuevoObjeto.setAnio(anio);
        add(nuevoObjeto);
        
        return nuevoObjeto;
    }
}
