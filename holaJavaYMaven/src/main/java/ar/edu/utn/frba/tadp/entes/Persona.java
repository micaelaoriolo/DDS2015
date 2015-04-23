package ar.edu.utn.frba.tadp.entes;

public class Persona implements Nombrable{
	
	private String nombre;
	private Direccion direccion;
	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona() {
		super();
	}
	
	public Persona(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public boolean viveEn(Direccion direccion) {
		return this.direccion.equals(direccion);
	}
	
	
	
	@Override
	public String toString() {
		return this.getNombre();
	}

	public Persona(String nombre, Direccion direccion) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	

}
