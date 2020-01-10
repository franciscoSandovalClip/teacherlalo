package com.selenium.tarea3;

public class Libro {
	
	private String titulo;
	private String autor;
	private int num_paginas;
	
	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNum_paginas() {
		return num_paginas;
	}
	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}
	
	public Libro() {	
	}
	
	public Libro(String titulo, String autor, int num_paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.num_paginas = num_paginas;
	}
	
	public void imprime() {
		System.out.println(this.titulo+this.autor+this.num_paginas);
	}
	

}
