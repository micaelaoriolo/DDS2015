package ar.edu.utn.frba.tadp.holamundo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import ar.edu.utn.frba.tadp.entes.Persona;
import ar.edu.utn.frba.tadp.entes.Direccion;

public class TestHashCode {
	
	public static void main(String[] args) {
		Direccion direccion = new Direccion("Esteban de Luca", 1322);
		Direccion otraInstancia = new Direccion("Esteban de Luca", 1322);
		System.out.println("direccion.equals(otraInstancia): " + direccion.equals(otraInstancia));
		Collection<Direccion> coleccion = new HashSet<Direccion>();
		coleccion.add(direccion);
		System.out.println("coleccion.contains(otraInstancia): "
		+ coleccion.contains(otraInstancia));
		}

}
