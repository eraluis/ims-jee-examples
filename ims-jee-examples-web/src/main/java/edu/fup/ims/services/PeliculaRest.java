package edu.fup.ims.services;

import edu.fup.ims.bo.PeliculaLBO;
import edu.fup.ims.model.Pelicula;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Luis Eraso
 */
@Path("/peliculas")

public class PeliculaRest {
    
    @Inject PeliculaLBO peliculaLBO;
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Pelicula> listar() {
        return peliculaLBO.findAll();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Pelicula buscar(@PathParam("id") Long pId ) {
        System.out.println("buscando pelicula con id: "+pId);
        return peliculaLBO.find(pId);
    }
        
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Pelicula agregar(Pelicula pelicula) {
        peliculaLBO.add(pelicula);
        return pelicula;
    }
    
    @DELETE
    @Path("{id}")
    public Response eliminar(@PathParam("id") Long pId ) {
        System.out.println("eliminarPelicula id:"+ pId);
        Pelicula p = peliculaLBO.find(pId);
        peliculaLBO.remove(p);
        return Response.noContent().build();
    }
    
}
