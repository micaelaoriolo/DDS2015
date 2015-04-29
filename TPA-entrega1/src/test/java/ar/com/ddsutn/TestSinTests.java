package ar.com.ddsutn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import ar.com.ddsutn.*;

public class TestSinTests {
	
	public static void main(String[] args) {
		
		Identificacion identificacion = new Identificacion("Micaela", 22, "femenino", null);
		
		Complexion complexion = new Complexion(150, 55);
		
		Ingrediente chori = new Ingrediente("chori", 500, null);
		Ingrediente chivito = new Ingrediente("chivito", 350, null);
		Ingrediente carne = new Ingrediente("carne", 200, null);
		Ingrediente pollo = new Ingrediente("pollo", 150, null);
		Ingrediente fruta = new Ingrediente("fruta", 50, null);
		Collection<Ingrediente> legustan = new ArrayList<Ingrediente>();
		legustan.add(chori);
		legustan.add(fruta);
		Preferencia preferencia = new Preferencia(legustan, null);
		
		Collection<CondicionPreexistente> condiciones = new ArrayList<CondicionPreexistente>();
		Vegano veg = new Vegano();
		Celiaco cel = new Celiaco();
		Hipertenso hip = new Hipertenso();
		Diabetico dia = new Diabetico();
		//condiciones.add(veg);
		condiciones.add(cel);
		condiciones.add(hip);
		condiciones.add(dia);
		
		
		Rutina rutina = new Rutina("Activa", 38);
		
		
		
		
		
		
		Usuario usuario = new Usuario(identificacion, complexion, preferencia, condiciones, rutina);
		
		System.out.println(usuario.esValido());
	
		
		
		
	}
	

}
