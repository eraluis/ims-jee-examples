package edu.fup.ims.bo.impl;

import edu.fup.ims.bo.PeliculaLBO;
import edu.fup.ims.model.Pelicula;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

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
    public Pelicula crearPelicula(String nombre, int anio) {
        Pelicula nuevoObjeto = new Pelicula();        
        nuevoObjeto.setTitulo(nombre);
        nuevoObjeto.setAnio(anio);
        add(nuevoObjeto); 
        return nuevoObjeto;
    }
    
    @Override
    public Pelicula buscarPorNombre(String nombre) {
        
        TypedQuery<Pelicula> query = 
                this.em.createQuery("SELECT p FROM Pelicula p WHERE p.titulo = :t", Pelicula.class);
        
        query.setParameter("t", nombre);
        return query.getSingleResult();
        
    }

    @Override
    public List<Pelicula> buscarPorAnio(int anio) {
           
        TypedQuery<Pelicula> query = 
                this.em.createQuery("SELECT p FROM Pelicula p WHERE p.anio = :a", Pelicula.class);
        
        query.setParameter("a", anio);
        return query.getResultList();
    }
    

    @Override
    public List<Pelicula> listarTodas() {
        return super.findAll();
    }

}
