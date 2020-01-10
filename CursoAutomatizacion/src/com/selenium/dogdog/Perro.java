package com.selenium.dogdog;

public class Perro {
	
	private int patas;
	private Boolean pelo;
	private String colorDePelo;
	
	public Perro() {
		this.patas = 4;
	}
	
	public void ladrar(String ladrido) {
		System.out.println(ladrido);
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public Boolean getPelo() {
		return pelo;
	}

	public void setPelo(Boolean pelo) {
		this.pelo = pelo;
	}

	public String getColorDePelo() {
		return colorDePelo;
	}

	public void setColorDePelo(String colorDePelo) {
		this.colorDePelo = colorDePelo;
	}
	
	

}
