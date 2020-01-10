package com.selenium.gastos;

public class GastosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gastos();

	}
	
	public static void gastos () {
		//Pedris
		int airbnb=429;
		int coche=0;
		int totalPedris = (airbnb+coche);
		//Paz
		int hotel=222;
		int totalPaz = hotel;
		//Paquis
		int cirque=315;
		int totalPaquis = cirque;
		
		int totaltotal=totalPedris+totalPaz+totalPaquis;
		
		int saldoPedris = ((totalPedris/3)+(totalPaquis/3)+(totalPaz/3))-totalPedris;
		System.out.println("El saldo de Pedris es de : $"+saldoPedris);
		
		int saldoPaquis = ((totalPedris/3)+(totalPaquis/3)+(totalPaz/3))-totalPaquis;
		System.out.println("El saldo de Paquis es de : $"+saldoPaquis);
		
		int saldoPaz = ((totalPedris/3)+(totalPaquis/3)+(totalPaz/3))-totalPaz;
		System.out.println("El saldo de Paz es de : $"+saldoPaz);
		
		System.out.println(totaltotal);
		
	}
}
