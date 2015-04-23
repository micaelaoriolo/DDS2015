package ar.edu.utn.frba.tadp.entes;

public class Direccion {
	
	private String calle;
	private int numero;
	
	public Direccion (String calle, int numero) {
		this.calle = calle;
		this.numero = numero;
	}
	
	

	public String getCalle() {
		return calle;
	}



	public void setCalle(String calle) {
		this.calle = calle;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	@Override
	public String toString() {
		return this.calle + " " + this.getNumero();
	}



	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Direccion)) {
			return false;
		}
		Direccion otraDireccion = (Direccion) obj;
		return this.calle.equals(otraDireccion.calle) && this.numero == otraDireccion.numero;
	}



	@Override
	public int hashCode() {
		return this.calle.hashCode() + this.numero;
	}
	
	
	
	

}
