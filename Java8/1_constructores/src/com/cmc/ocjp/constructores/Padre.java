package com.cmc.ocjp.constructores;


public class Padre {
	public Padre() {
		System.out.print("Ejecuta constructor padre");
	}	
	public Padre(int n) {
		this();
		System.out.print("Ejecuta constructor padre");
	}
}
