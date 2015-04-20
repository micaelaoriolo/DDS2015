package ar.edu.utn.frba.tadp.holamundo;

public class Test {
	
	public static void main(String[] args) {
		RecepcionistaClasico recepcionistaC = new RecepcionistaClasico();
		RecepcionistaFormal rF = new RecepcionistaFormal();
		Mundo mundo = new Mundo();
		recepcionistaC.saludar(mundo);
		rF.saludar(mundo);
	}

}
