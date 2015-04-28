package ar.com.ddsutn;

import java.util.Collection;

public class Usuario {
	
	private Identificacion identificacion;
	private Complexion complexion;
	private Preferencia preferencia;
	private Collection<CondicionPreexistente> condiciones;
	private Boolean valido;
	
	
	public Identificacion getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(Identificacion identificacion) {
		this.identificacion = identificacion;
	}
	public Complexion getComplexion() {
		return complexion;
	}
	public void setComplexion(Complexion complexion) {
		this.complexion = complexion;
	}
	public Preferencia getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(Preferencia preferencia) {
		this.preferencia = preferencia;
	}
	public Collection<CondicionPreexistente> getCondiciones() {
		return condiciones;
	}
	public void setCondiciones(Collection<CondicionPreexistente> condiciones) {
		this.condiciones = condiciones;
	}
	public Boolean getValido() {
		return valido;
	}
	public void setValido(Boolean valido) {
		this.valido = valido;
	}
	
	
	
	
	

}
