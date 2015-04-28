package ar.com.ddsutn;

public class Diabetico implements CondicionPreexistente{


	public Boolean esValido(Usuario usuario) {
		
		Identificacion identificacion = usuario.getIdentificacion();
		String sexo = identificacion.getSexo();
		
		if ((sexo == null) || (sexo.isEmpty())) return false;
		
		Preferencia preferencia = usuario.getPreferencia();
		
		if (preferencia.getLeGustan().isEmpty()) return false;
		
		return true;
	}
	
	

}
