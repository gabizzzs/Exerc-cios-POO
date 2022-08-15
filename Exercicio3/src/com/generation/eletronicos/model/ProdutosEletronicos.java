package com.generation.eletronicos.model;

public class ProdutosEletronicos {
	
	private String modelo;
	private int volts;
	
	public ProdutosEletronicos(String modelo, int volts) {
		this.modelo = modelo;
		this.volts = volts;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
	
	public void visualizar() {
		System.out.println("Qual modelo: " + modelo);
		System.out.println("Quantos volts: " + volts);
	}
	
	
	
	
	
	
	

}
