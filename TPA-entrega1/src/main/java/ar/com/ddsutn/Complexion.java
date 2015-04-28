package ar.com.ddsutn;

public class Complexion {
	
	private Integer altura;
	private Integer peso;
	
	public Complexion(Integer altura, Integer peso) {
		//super();
		this.altura = altura;
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public boolean esValido(Usuario usuario)
	{
		if (this.altura != null && this.peso != null) return true;
		return false;			
	}
	
	

}
