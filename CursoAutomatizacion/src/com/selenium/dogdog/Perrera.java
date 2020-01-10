package com.selenium.dogdog;

public class Perrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maltes perro = new Maltes();
		System.out.println(perro.getPatas());
		Maltes chai = new Maltes();
		chai.setPatas(5);
		System.out.println(chai.getPatas());
		chai.ladrar("guau");

	}

}
