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

    public String crearPelicula(String titulo, int anio, int duracion, String pais) {

        Pelicula peliculaNueva = new Pelicula();
        peliculaNueva.setTitulo(titulo);
        peliculaNueva.setDuracion(duracion);
        peliculaNueva.setAnio(anio);
        peliculaNueva.setPais(pais);

        peliculaLBO.add(peliculaNueva); // Con esta instruccion se guarda en BD

        return "objeto creado con id: " + peliculaNueva.getId();
    }

}
