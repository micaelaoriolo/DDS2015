package com.dds.utn;

import java.util.List;


import org.uqbarproject.jpa.java8.extras.EntityManagerOps;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;


public class Main implements WithGlobalEntityManager, EntityManagerOps, TransactionalOps{

	public static void main(String[] args) {
		
		new Main().run();
		
//		List<Mascota> mascotas; 
//		
//		mascotas = Home.instancia.listarMascotas();
//		
//		for (Mascota mascota: mascotas) {
//			mascota.toString();
//		}
		
		//new Main().adoptarAlGato();
	
		//new Main().juguetes();
	}
	
	public void juguetes() {
		withTransaction(() -> {
			Mascota gato = new Mascota();
			gato.setNombre("pepe");
			Mascota gato1 = new Mascota();
			gato1.setNombre("Astor");
			
			RepositorioMascotas.instancia.agregarMascota(gato1);
			RepositorioMascotas.instancia.agregarMascota(gato);
			
			Juguete juguete = new Juguete();
			
			entityManager().persist(juguete);
			
			gato.adquirirJuguete(juguete);
			

		});
	}
	
	
	public void agregarEnemigos() {
		withTransaction(() -> {
			Mascota gato = new Mascota();
			gato.setNombre("pepe");
			Mascota gato1 = new Mascota();
			gato1.setNombre("Astor");
			
			RepositorioMascotas.instancia.agregarMascota(gato1);
			RepositorioMascotas.instancia.agregarMascota(gato);
			
			gato.agregarEnemigo(gato1);
			

		});
	}
	
	
	public void adoptarAlGato() {
		withTransaction(() -> {
			Mascota gato = RepositorioMascotas.instancia.buscarMascota(1);
			Humano juan = RepositorioHumanos.instancia.buscarHumano(1);
			
			juan.adoptar(gato);
			
			RepositorioMascotas.instancia.actualizarMascota(gato);
			
			
			    	
		});
		
	}
	
	public void run() {
		Mascota perro = new Mascota();
		Mascota gato = new Mascota();
		Humano juan = new Humano();
	
		perro.setNombre("Tomi");
		juan.setNombre("Juan");
		gato.setNombre("oli");
		
	
	    withTransaction(() -> {
	    	RepositorioMascotas.instancia.agregarMascota(gato);
			RepositorioHumanos.instancia.agregarPersona(juan);
			RepositorioMascotas.instancia.agregarMascota(perro);
			
			juan.adoptar(perro);
			juan.adoptar(perro);
	    });
	  }
	
}
