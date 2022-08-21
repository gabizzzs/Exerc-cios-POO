package com.generation.heranca.model;

public class Sons extends Animal implements  Cavalo, Cachorro, Preguica {
	
	private String Sons;

	public Sons(String nome, int idade, String som, String sons) {
		super(nome, idade, som);
		Sons = sons;
	}

	public String getSons() {
		return Sons;
	}

	public void setSons(String sons) {
		Sons = sons;
	}

	@Override
	public void correrGalopando() {
		System.out.println("O cavalo está correndo galopando!");
		
	}

	@Override
	public void correr() {
		System.out.println("O cachorro está correndo!");
		
	}

	@Override
	public void subirArvore() {
		System.out.println("A preguiça está subindo na árvore!");
		
	}
	

}
