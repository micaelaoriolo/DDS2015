package ar.edu.utn.frba.tadp.holamundo;

import java.util.ArrayList;
import java.util.Collection;

import ar.edu.utn.frba.tadp.entes.Nombrable;
import ar.edu.utn.frba.tadp.entes.Persona;
import ar.edu.utn.frba.tadp.entes.Direccion;


public class Test {
	
	public static void main(String[] args) {
		
		Persona persona = new Persona("Leo", new Direccion("Esteban de luca", 1322));
		System.out.println("La persona " + persona + " vive en " + persona.getDireccion());
		
		
		/*Collection<Nombrable> nombrables = getNombrables();
		Recepcionista recepcionista = makeRecepcionista();
		for(Nombrable nombrable : nombrables)
		{
			recepcionista.saludar(nombrable);
		}*/
		
		
		/*Recepcionista recepcionista = makeRecepcionista();
		Nombrable nombrable = new Mundo();
		recepcionista.saludar(nombrable);
		nombrable = new Persona ("José");
		recepcionista.saludar(nombrable);*/
		
		
		
		
		/*RecepcionistaClasico recepcionistaC = new RecepcionistaClasico();
		RecepcionistaFormal rF = new RecepcionistaFormal();
		Mundo mundo = new Mundo();
		recepcionistaC.saludar(mundo);
		rF.saludar(mundo);*/
	}
	
	private static Collection<Nombrable> getNombrables() {
		Collection<Nombrable> nombrables = new ArrayList<Nombrable>();
		nombrables.add(new Mundo());
		nombrables.add(new Persona("Jose"));
		nombrables.add(new Persona("Juan"));
		
		return nombrables;
	}

	private static Recepcionista makeRecepcionista() {
		return new RecepcionistaClasico();
	}

}
