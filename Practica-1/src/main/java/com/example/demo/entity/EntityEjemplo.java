package com.example.demo.entity;

import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EntityEjemplo {
	@Id
	@GeneratedValue
	private long id;
	
	@Column (name = "LETRAS")
	private String letras;
	
	@Column ( name = "NUMEROS")
	private int numeros;
	
	@Column (name = "Hash")
	private String hash;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLetras() {
		return letras;
	}

	public void setLetras(String letras) {
		this.letras = letras;
	}

	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public EntityEjemplo(long id, String letras, int numeros, String hash) {
		super();
		this.id = id;
		this.letras = letras;
		this.numeros = numeros;
		this.hash = hash;
	}

	public EntityEjemplo() {
	}

	
	
	
	
	
	

}
