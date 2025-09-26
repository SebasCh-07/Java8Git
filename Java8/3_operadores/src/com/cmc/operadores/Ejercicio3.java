package com.cmc.operadores;

public class Ejercicio3 {

	public static void main(String[] args) {
		int edad=17;
		String tipo;
		tipo = (edad>50)?"adulto mayor":(edad<18)?"menor":"adulto";
		
		System.out.println(tipo);

	}

}
