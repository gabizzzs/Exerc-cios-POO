package com.generation.aviao.model;

public class Aviao {

	private String companhia;
	private int passageiros;
	private String voo;
	
	public Aviao(String companhia, int passageiros, String voo) {
		this.companhia = companhia;
		this.passageiros = passageiros;
		this.voo = voo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public String getVoo() {
		return voo;
	}

	public void setVoo(String voo) {
		this.voo = voo;
	}
	
	public void visualizar() {
		System.out.println("Qual a companhia de vôo: " + companhia);
		System.out.println("Quantos passageiros o avião abriga:  " + passageiros);
		System.out.println("Qual o tipo de vôo: " + voo);
		System.out.println("\n");
		
	}
	
}
