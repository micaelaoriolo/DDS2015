package com.dds.utn;

import javax.persistence.*;

@Entity
public class Juguete {
	
	@Id @GeneratedValue
	private long id;
	
	private String name;
	
	@ManyToOne 
	private Mascota duenio;
	
	public Juguete() {
		
	}
	

	public Mascota getDuenio() {
		return duenio;
	}


	public void setDuenio(Mascota duenio) {
		this.duenio = duenio;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
