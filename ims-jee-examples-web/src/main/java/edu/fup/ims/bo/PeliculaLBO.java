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

    //Create
    public Pelicula crearPelicula(String nombre, int anio);
    
    //Read
    public Pelicula buscarPorNombre(String nombre);
    public List<Pelicula> buscarPorAnio(int anio);
    public List<Pelicula> listarTodas();
    
    //Update
    
    //Delete

}