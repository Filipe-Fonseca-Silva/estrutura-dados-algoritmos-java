package com.filipe.estruturadados.vetor.teste;

import com.filipe.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		
		System.out.println(vetor.busca(0));
		System.out.println(vetor.busca(1));
		System.out.println(vetor.busca(2));
	}
}
