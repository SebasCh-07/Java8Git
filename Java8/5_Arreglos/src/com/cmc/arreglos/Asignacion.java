package com.cmc.arreglos;

public class Asignacion {

	public static void main(String[] args) {
		int arreglo3[] = {4,3,2};
		int arreglo4[] = new int[1];
		
		arreglo4=arreglo3;
		
		System.out.println(arreglo4[0]);
		System.out.println(arreglo3[0]);

	}

}
