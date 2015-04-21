package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.Nombrable;
import ar.edu.utn.frba.tadp.entes.Persona;

public class Test {
	
	public static void main(String[] args) {
		
		Recepcionista recepcionista = makeRecepcionista();
		Nombrable nombrable = new Mundo();
		recepcionista.saludar(nombrable);
		nombrable = new Persona ("José");
		recepcionista.saludar(nombrable);
		
		
		
		
		/*RecepcionistaClasico recepcionistaC = new RecepcionistaClasico();
		RecepcionistaFormal rF = new RecepcionistaFormal();
		Mundo mundo = new Mundo();
		recepcionistaC.saludar(mundo);
		rF.saludar(mundo);*/
	}
	
	private static Recepcionista makeRecepcionista() {
		return new RecepcionistaClasico();
	}

}
