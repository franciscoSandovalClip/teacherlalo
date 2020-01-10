package com.selenium.tarea3;

public class Cuenta{
	
	private String titular;
	private double cantidad;

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void imprimir() {
		System.out.println("======================================");
		System.out.println("Cliente : "+this.titular);
		System.out.println("Balance : $"+this.cantidad);
		System.out.println("======================================");

	}
	
	public void ingresa(double dinero) {
		if(dinero<=0) {
			System.out.println("Operación no disponible");
		}
		else{
			this.cantidad = cantidad+dinero;
			System.out.println("Transacción exitosa");
			System.out.println("Nuevo Balance : $"+this.cantidad);
		}
	}
	
	public void retira(double dinero) {
		this.cantidad = cantidad-dinero;
		if (cantidad<0) {
			this.cantidad = 0;
		}
		System.out.println("Transacción exitosa");
		System.out.println("Nuevo Balance : $"+this.cantidad);
	}
	

}
