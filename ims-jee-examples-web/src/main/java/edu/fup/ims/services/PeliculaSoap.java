package edu.fup.ims.services;

import edu.fup.ims.bo.PeliculaLBO;
import edu.fup.ims.model.Pelicula;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author Luis Eraso
 */
@WebService
@Stateless
public class PeliculaSoap {

    @Inject
    PeliculaLBO peliculaLBO;

    public String crearPelicula(String t, int a) {
        Pelicula p = new Pelicula();
        p.setTitulo(t);
        p.setAnio(a);        
        peliculaLBO.add(p);        
        return "objeto creado con id: " + p.getId();
    }
    
    
    public String buscarPelicula(Long id){
        Pelicula p = peliculaLBO.find(id);        
        return "titulo: " + p.getTitulo() + " año: "+p.getAnio();        
    }
    
    public String eliminarPelicula(Long id){
        Pelicula peliculaEncontrada = peliculaLBO.find(id);
        
        if(peliculaEncontrada != null){
            peliculaLBO.remove(peliculaEncontrada);
            return "Pelicula borrada";
        } else {
            return "Pelicula no encontrada";
        }          
    }

}
