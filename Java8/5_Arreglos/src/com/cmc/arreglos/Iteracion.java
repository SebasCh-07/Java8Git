package com.cmc.arreglos;

public class Iteracion {

	public static void main(String[] args) {
		int arreglo[]= {1,2,3};
		
		for(int i=0; i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
		
		System.out.println("hanced for");
		for(int item:arreglo) {
			System.out.println(item);
		}

	}

}
