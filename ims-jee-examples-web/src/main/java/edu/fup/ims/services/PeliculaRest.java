package edu.fup.ims.services;

import edu.fup.ims.bo.PeliculaLBO;
import edu.fup.ims.model.Pelicula;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Luis Eraso
 */
@Path("/peliculas")
@Produces({MediaType.APPLICATION_JSON})
public class PeliculaRest {
    
    @Inject PeliculaLBO peliculaLBO;
    
    @GET
    public List<Pelicula> listarPeliculas() {
        return peliculaLBO.findAll();
    }
        
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Pelicula agregarPelicula(Pelicula pelicula) {
        peliculaLBO.add(pelicula);
        return pelicula;
    }
}
