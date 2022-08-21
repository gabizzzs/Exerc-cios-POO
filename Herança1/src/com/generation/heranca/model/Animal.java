package com.generation.heranca.model;

public class Animal {
	
	private String nome;
	private int idade;
	private String som;
	
	public Animal(String nome, int idade, String som) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public void visualizar() {
		System.out.println("O animal nome do animal é: " + this.getNome());
		System.out.println("A idade é: " + this.getIdade());
		System.out.println("O som emitido é: " + this.getSom());
	}

		
	
}
