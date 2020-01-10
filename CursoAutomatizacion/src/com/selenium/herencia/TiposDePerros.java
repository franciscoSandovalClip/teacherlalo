package com.selenium.herencia;

public class TiposDePerros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chihuahua david = new Chihuahua();
		david.peso();
		Dalmata paquito = new Dalmata();
		paquito.peso();
		david.ladrar("guau");
		paquito.ladrar("guaaaaaaaaaaaauuuuu");

	}

}
