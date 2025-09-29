package com.cmc.herencia;

public class TestReferencias {

	public static void main(String[] args) {
		Animal a = new Animal();
		 
//---------------------------------------------------------------------

		Object obj = new Perro();  //Solo toma los metodos que tenga object
		Animal anm=new Perro();    //Solo toma los metodos que tiene Animal incluyendo lo metodos de las clases Padre
		Perro p = new Perro();     //Solo toma los metodos que tenga Perro incluyendo lo metodos de las clases Padre
		
		//obj.ladrar();
		//obj.dormir();
		
		obj.hashCode();
		
		//anm.ladrar();
		anm.dormir();
		anm.hashCode();
		
		p.dormir();
		p.ladrar();
		p.hashCode();		
	
	}

}
