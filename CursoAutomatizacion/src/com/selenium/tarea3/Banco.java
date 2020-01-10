package com.selenium.tarea3;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cliente01 = new Cuenta("Francisco Sandoval");
		cliente01.imprimir();
//		cliente01.ingresa(10);
//		cliente01.imprimir();
//		cliente01.ingresa(10);
//		cliente01.imprimir();
		
		Cuenta cliente02 = new Cuenta("Pedro Macias",1234.5);
//		cliente02.imprimir();
		cliente02.retira(1000);
//		cliente02.imprimir();
		cliente02.ingresa(10000);
//		cliente02.imprimir();
//		cliente02.ingresa(-5);
		cliente02.retira(20000);
//		cliente02.imprimir();
	}

}
