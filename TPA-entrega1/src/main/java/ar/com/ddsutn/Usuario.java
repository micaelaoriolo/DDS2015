package ar.com.ddsutn;

import java.util.Collection;

public class Usuario {
	
	private Identificacion identificacion;
	private Complexion complexion;
	private Preferencia preferencia;
	private Collection<CondicionPreexistente> condiciones;
	private Rutina rutina;
	
	public boolean esValido()
	{	
		return this.condiciones.stream().allMatch(condicion -> condicion.esValido(this)) && 
				this.complexion.esValido(this) &&
				this.identificacion.esValido(this) &&
				this.rutina.esValido(this);
	}
	
	public Usuario(Identificacion identificacion, Complexion complexion,
			Preferencia preferencia,
			Collection<CondicionPreexistente> condiciones, Rutina rutina) {
		this.identificacion = identificacion;
		this.complexion = complexion;
		this.preferencia = preferencia;
		this.condiciones = condiciones;
		this.rutina = rutina;
	}
	public Identificacion getIdentificacion() {
		return identificacion;
	}

	public Preferencia getPreferencia() {
		return preferencia;
	}


	
	
	
	
	

}
