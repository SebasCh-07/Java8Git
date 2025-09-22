package com.cmc.ocjp.constructores;


public class Padre {
	public Padre() {}	
	public Padre(int n) {
		this();
		System.out.print("Ejecuta constructor padre");
	}
}
