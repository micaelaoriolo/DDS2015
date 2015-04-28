package ar.com.ddsutn;


import java.util.Collection;

public class Preferencia {
	
	private Collection<Ingrediente> leGustan;
	private Collection<Ingrediente> noLeGustan;
	
	
	public Preferencia(Collection<Ingrediente> leGustan,
			Collection<Ingrediente> noLeGustan) {
		//super();
		this.leGustan = leGustan;
		this.noLeGustan = noLeGustan;
	}

	public Collection<Ingrediente> getLeGustan() {
		return leGustan;
	}

	public void setLeGustan(Collection<Ingrediente> leGustan) {
		this.leGustan = leGustan;
	}

	public Collection<Ingrediente> getNoLeGustan() {
		return noLeGustan;
	}

	public void setNoLeGustan(Collection<Ingrediente> noLeGustan) {
		this.noLeGustan = noLeGustan;
	}

	public Boolean puedeComer(Ingrediente ingrediente) {
		return null;
	}
	
	

}
