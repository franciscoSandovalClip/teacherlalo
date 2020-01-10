package com.selenium.constructor;

public class NuevoEjecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NuevaPersona persona = new NuevaPersona(); 
		
		NuevaPersona paquito = new NuevaPersona("Francisco Sandoval");
		NuevaPersona angie = new NuevaPersona("Angie", "Niña");
		NuevaPersona yesi = new NuevaPersona("Yesi", "Niña", 28);
		NuevaPersona lalo = new NuevaPersona();
		lalo.setName("Lalo");
		lalo.setAge(40);
		lalo.setSex("Niño");
		
		System.out.println(paquito.getName());
		System.out.print(yesi.getName()+" "+yesi.getSex()+" "+yesi.getAge());
		System.out.println("\n"+lalo.getName()+" "+lalo.getAge());

	}

}
