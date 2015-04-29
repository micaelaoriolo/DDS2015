package ar.com.ddsutn;


import java.util.Collection;

public class Preferencia {
	
	private Collection<Ingrediente> leGustan;
	private Collection<Ingrediente> noLeGustan;
	
	
	public Preferencia(Collection<Ingrediente> leGustan,
			Collection<Ingrediente> noLeGustan) {
		this.leGustan = leGustan;
		this.noLeGustan = noLeGustan;
	}

	public Collection<Ingrediente> getLeGustan() {
		return leGustan;
	}

	public Boolean puedeComer(Ingrediente ingrediente) {
		return leGustan.stream().anyMatch(ing -> ing.getNombre().equals(ingrediente.getNombre()));
	}
	
	

}
