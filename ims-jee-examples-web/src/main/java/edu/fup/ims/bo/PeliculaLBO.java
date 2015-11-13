package edu.fup.ims.bo;

import edu.fup.ims.model.Pelicula;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Luis Eraso
 */
@Local
public interface PeliculaLBO extends CrudBO<Pelicula> {

    public List<Pelicula> listarPeliculas();
    
    public Pelicula crearPelicula(String nombre, int anio);

}