package ar.com.ddsutn;

public class Rutina {
	
	private String tipo;
	private Integer cantidadEjercicio;
	
	
	public Rutina(String tipo, Integer cantidadEjercicio) {
		this.tipo = tipo;
		this.cantidadEjercicio = cantidadEjercicio;
	}
	
	public boolean esValido(Usuario usuario)
	{
		return (this.tipo != null || this.tipo != null);
	}
	

}
