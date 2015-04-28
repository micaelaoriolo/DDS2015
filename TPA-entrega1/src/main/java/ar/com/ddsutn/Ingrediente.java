package ar.com.ddsutn;

import java.util.Collection;

public class Ingrediente {
	
	private String nombre;
	private int calorias;
	private Collection<CondicionPreexistente> esInadecuadoPara;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	public Collection<CondicionPreexistente> getEsInadecuadoPara() {
		return esInadecuadoPara;
	}
	public void setEsInadecuadoPara(
			Collection<CondicionPreexistente> esInadecuadoPara) {
		this.esInadecuadoPara = esInadecuadoPara;
	} 
	
	


}
