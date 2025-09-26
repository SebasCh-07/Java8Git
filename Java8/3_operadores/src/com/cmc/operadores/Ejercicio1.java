package com.cmc.operadores;

public class Ejercicio1 {

	public static void main(String[] args) {
		int x = 10;
		int z = x++;//++ despues de x, suma 1 pero no de inmediato, se refleja la proxima vez que sea utilizado x
		//por lo tanto z toma el valor de 10 y luego se realiza la suma en x
		
		System.out.println("x: "+x);;//11
		System.out.println("z: "+z);;//10

	}

}
