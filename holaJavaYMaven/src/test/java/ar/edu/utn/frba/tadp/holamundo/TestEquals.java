package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.Persona;
import ar.edu.utn.frba.tadp.entes.Direccion;

public class TestEquals {
	
	public static void main(String[] args) {
		
		Direccion direccion = new Direccion("Esteban de Luca", 1322);
		Persona persona = createPersona();
		//Persona persona = new Persona("Leo", new Direccion("Esteban de Luca", 1322));
		if (persona.viveEn(direccion)) {
			System.out.println(persona + " vive en " + direccion);
		} 
		else {
			System.out.println(persona + " no vive en " + direccion
					+ ", vive en " + persona.getDireccion());
		}
		
		
		/*Direccion direccion = new Direccion("Esteban de Luca", 1322);
		Direccion direccionComparar = new Direccion("E", 1322);
		Persona persona = new Persona("Leo", direccion);
		if (persona.viveEn(direccionComparar)) {
			System.out.println(persona + " vive en " + direccion);
		} else {
			System.out.println(persona + " no vive en " + direccionComparar
					+ ", vive en " + persona.getDireccion());
		}*/
	}
	
	private static Persona createPersona() {
		return new Persona("Leo", new Direccion("Esteban de Luca",1322));
	}

}