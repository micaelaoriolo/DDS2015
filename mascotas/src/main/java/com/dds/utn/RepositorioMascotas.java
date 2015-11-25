package com.dds.utn;

import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

public class RepositorioMascotas implements WithGlobalEntityManager {
	
	public static RepositorioMascotas instancia = new RepositorioMascotas();

	  public List<Mascota> listarMascotas() {
	    return entityManager()
	        .createQuery("from Mascota", Mascota.class) 
	        .getResultList();
	  }
	  

	  
	  public void actualizarMascota(Mascota mascota) {
	  }

	  public Mascota buscarMascota(long id) {
	    return entityManager().find(Mascota.class, id);
	  }
	  
	

	  public void agregarMascota(Mascota mascota) {
	    entityManager().persist(mascota);
	  }
	  


//	  public List<Consultora> buscarPorNombre(String nombre) {
//	    return entityManager() //
//	        .createQuery("from Consultora c where c.nombre like :nombre", Consultora.class) //
//	        .setParameter("nombre", "%" + nombre + "%") //
//	        .getResultList();
//	  }







  

}