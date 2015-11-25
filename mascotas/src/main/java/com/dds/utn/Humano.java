package com.dds.utn;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;


@Entity
public class Humano {
	
	@Id @GeneratedValue
	private long id;
	
	private String nombre;
	
	@OneToMany @JoinColumn(name="id_duenio")
	private Set<Mascota> mascotas;
	
	public Humano() {
		mascotas = new HashSet<Mascota>();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void adoptar(Mascota mascota) {
		mascotas.add(mascota);
	}
	
	

}
