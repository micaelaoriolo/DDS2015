package ar.com.ddsutn;

import java.time.LocalDate;

public class Identificacion {
	
	private String nombre;
	private Integer edad;
	private String sexo;
	private LocalDate fechaDeNacimiento;
	
	
	public boolean esValido(Usuario usuario)
	{
		if (this.nombre.length() <= 4) return false;
		return true;
	}
	
	
	public Identificacion(String nombre, int edad, String sexo,
			LocalDate fechaDeNacimiento) {
		//super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	
	

}
