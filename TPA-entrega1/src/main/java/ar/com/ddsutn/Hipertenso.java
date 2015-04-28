package ar.com.ddsutn;

public class Hipertenso implements CondicionPreexistente{

	public Boolean esValido(Usuario usuario) {
		
		Preferencia preferencia = usuario.getPreferencia();
		
		if (preferencia.getLeGustan().isEmpty()) return false;
		
		return true;
	}

}
