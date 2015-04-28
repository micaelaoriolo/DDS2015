package ar.com.ddsutn;

import java.util.Collection;

public class Vegano implements CondicionPreexistente{

	
	public Boolean esValido(Usuario usuario) {
		
		Preferencia preferencia = usuario.getPreferencia();
		
		Collection<Ingrediente> legustan = preferencia.getLeGustan();

		return legustan.stream().noneMatch(ingrediente -> ingrediente.getNombre().equals("chori")
															|| ingrediente.getNombre().equals("chivito")
															|| ingrediente.getNombre().equals("pollo")
															|| ingrediente.getNombre().equals("carne"));
		
	}
	

}
