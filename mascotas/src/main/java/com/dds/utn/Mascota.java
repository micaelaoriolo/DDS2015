package com.dds.utn;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
public class Mascota {
	
	@Id @GeneratedValue
	private long id;
	
	private String nombre;
	
	@ManyToMany @JoinTable(name="enemigos")
	private Collection<Mascota> enemigos;
	
	public Mascota() {
		enemigos = new HashSet<Mascota>();
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
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	public void agregarEnemigo(Mascota mascota) {
		this.enemigos.add(mascota);
	}
	
	public void adquirirJuguete(Juguete juguete) {
		juguete.setDuenio(this);
	}
	

}
