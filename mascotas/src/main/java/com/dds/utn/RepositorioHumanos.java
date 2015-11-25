package com.dds.utn;

import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

public class RepositorioHumanos implements WithGlobalEntityManager {
	
	public static RepositorioHumanos instancia = new RepositorioHumanos();

	  public void actualizarHumano(Humano humano) {
		  entityManager().refresh(humano);
	  }
	  
	  public Humano buscarHumano(long id) {
	    return entityManager().find(Humano.class, id);
	  }

	  
	  public void agregarPersona(Humano humano) {
		entityManager().persist(humano);
	  }

//	  public List<Consultora> buscarPorNombre(String nombre) {
//	    return entityManager() //
//	        .createQuery("from Consultora c where c.nombre like :nombre", Consultora.class) //
//	        .setParameter("nombre", "%" + nombre + "%") //
//	        .getResultList();
//	  }







  

}
