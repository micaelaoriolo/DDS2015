package ar.edu.utn.frba.tadp.holamundo;

public class RecepcionistaFormal extends Recepcionista {

	@Override
	protected String armarSaludo(Mundo mundo) {
		return "Buen dia estimado " + mundo.getNombre();
	}

}
