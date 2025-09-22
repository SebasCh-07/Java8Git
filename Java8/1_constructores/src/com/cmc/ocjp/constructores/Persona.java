package com.cmc.ocjp.constructores;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona (String nombre) {
		this.nombre = nombre;
	}
	
	public Persona (String nombre, int edad) {
		this("Sebas");
		this.nombre=nombre;
		this.edad=edad;
		Persona(nombre);
	}
}
