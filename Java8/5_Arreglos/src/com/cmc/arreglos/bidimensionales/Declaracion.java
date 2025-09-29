package com.cmc.arreglos.bidimensionales;

public class Declaracion {

	public static void main(String[] args) {
		int arreglo1a[];
		int[] arreglo2[];
		int arreglo3 [][];
		int arreglo4 [][]= {{2,3},{8},{5,6}};
		
		//arreglo2 = new int [][] esto compila
		arreglo2 = new int [3][];
		arreglo3 = new int [3][5];
		///arreglo3 = new int [][5]; esto no comppila
		
		System.out.println(arreglo4[0][1]);
		System.out.println(arreglo3[0].length);
		
		
		//ITERACION
		int arreglo5 [][]= {{2,3},{8},{5,6},{9,8,7}};
		System.out.println("Iteracion con for");
		for (int i=0; i<arreglo5.length;i++) {
			
			System.out.println(" ");
			System.out.println("--Celda: "+i);
			
			for (int j=0; j<arreglo5[i].length;j++) {
				System.out.print("| "+arreglo5[i][j]+" |");
			}
			
			System.out.println(" <--Arreglo de tamaño: "+arreglo5[i].length);
			System.out.println("-------------------------------------------");
		}
		
//-----------------------------------------------------------------------------------------------------------------
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Iteracion con enhanced for");
		int i = 0;
		
		for (int[] arr:arreglo5) {
			
			System.out.println(" ");
			System.out.println("---Celda:"+i);
			i = i+1;
			
			for (int val: arr) {
				System.out.print("| "+val+" |");
			}
			
			System.out.println(" <--Arreglo de tamaño: "+arr.length);
			System.out.println("-------------------------------------------");
		}
		
		
				
	}

}
