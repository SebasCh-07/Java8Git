package com.cmc.herencia;

public class Perro extends Animal {
	 void ladrar () {
		System.out.println("Ladrar");
	}
	
	public void dormir () {
		System.out.println("PERRO DURMIENDO");
	}
	
	public static void main(String[] args) {
		Perro p = new Perro();
		p.ladrar();
	}
}


