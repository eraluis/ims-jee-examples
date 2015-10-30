/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fup.ims.bo.impl;

import edu.fup.ims.bo.PeliculaLBO;
import edu.fup.ims.model.Pelicula;
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
}
