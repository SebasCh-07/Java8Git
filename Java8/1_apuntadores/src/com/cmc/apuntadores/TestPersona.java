package com.cmc.apuntadores;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1;
		p1= new Persona();
		System.out.println("cedula: "+p1.cedula); //Cualquier atributo te tipo Clase es null
		System.out.println("nombre: "+p1.nombre);
		System.out.println("edad: "+p1.edad);
		System.out.println("estado: "+p1.estado);
		System.out.println(p1.hashCode());
		
		Persona p2 = new Persona("soy p2");
		p1 = p2; //p1 ya no apunta al objeto de arriba, p1 ahora toma el rol de p2
		System.out.println(p2.hashCode());
		p1.nombre = "Pepe";
		p1.estatura = 1.72;
		System.out.println("cedula: "+p1.nombre);
		System.out.println("nombre: "+p1.estatura);
		System.out.println(p1.hashCode());

	}

}
