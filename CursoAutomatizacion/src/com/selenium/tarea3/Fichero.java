package com.selenium.tarea3;

public class Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro librouno = new Libro("A la chingada", "Paquito", 25);
		Libro librodos = new Libro("Cien años de soledad","Gabriel Garcia",540);
		Libro librotres = new Libro("El raton vaquero","Emilio Clark", 777);
		Libro librocuatro = new Libro("La cenicienta","Javier Duarte",238);
		Libro librocinco = new Libro("El libro del mundo","EPN",2343);
		
		System.out.println(librouno.getTitulo()+" by "+librouno.getAutor()+". Pags:"+librouno.getNum_paginas());
		System.out.println(librodos.getTitulo()+" by "+librodos.getAutor()+". Pags:"+librodos.getNum_paginas());
		System.out.println(librotres.getTitulo()+" by "+librotres.getAutor()+". Pags:"+librotres.getNum_paginas());
		System.out.println(librocuatro.getTitulo()+" by "+librocuatro.getAutor()+". Pags:"+librocuatro.getNum_paginas());
		System.out.println(librocinco.getTitulo()+" by "+librocinco.getAutor()+". Pags:"+librocinco.getNum_paginas());

		librouno.imprime();
		librocuatro.imprime();
		librocinco.imprime();
		
//		if (librouno.getNum_paginas()>librodos.getNum_paginas()) {
//			System.out.println(librouno.getTitulo()+" tiene más paginas que "+librodos.getTitulo());
//		}else {
//			System.out.println(librodos.getTitulo()+" tiene más paginas que "+librouno.getTitulo());
//		}

	}

}
