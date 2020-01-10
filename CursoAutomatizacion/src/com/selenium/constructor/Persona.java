package com.selenium.constructor;

public class Persona {
	
	private String name;
	private int age;
	private String sexo;
	
	public void setNombre(String name) {
		this.name = name;
	}
	public void setEdad(int age) {
		this.age = age;
	}
	
	public String getNombre () {
		return this.name;
	}
	
	public int getEdad() {
		return this.age;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return this.sexo;
		
	}
	

}
