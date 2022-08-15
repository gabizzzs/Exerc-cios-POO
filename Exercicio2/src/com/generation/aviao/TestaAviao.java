package com.generation.aviao;

import com.generation.aviao.model.Aviao;

public class TestaAviao {
	public static void main(String args[]) {
		
		Aviao v1 = new Aviao("Azul", 80, "Conexão");
		v1.visualizar();
		
		Aviao v2 = new Aviao("Gol", 100, "Escala");
		v2.visualizar();
		
		v2.setCompanhia("Latam");
		v2.visualizar();
		
		v1.getPassageiros();
		
	}

}
