package com.filipe.estruturadados.vetor;

public class Vetor {

	// Atributos.
	private String[] elementos;
	private int tamanho;

	// Metodo construtor.
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	// Adiciona um elemento no vetor.
	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	// Obtem um elemento de uma posicao do vetor.	
	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		return this.elementos[posicao];
	}
	
	// Retorna o tamanho do vetor.
	public int tamanho() {
		return this.tamanho;
	}
	
	// Imprime somente os elementos do vetor.
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i = 0; i < this.tamanho -1; i ++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if(this.tamanho > 0) {
			s.append(elementos[this.tamanho -1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}
