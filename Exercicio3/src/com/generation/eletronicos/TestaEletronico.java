package com.generation.eletronicos;

import com.generation.eletronicos.model.ProdutosEletronicos;

public class TestaEletronico {
	public static void main(String args[]) {
	
		ProdutosEletronicos p1 = new ProdutosEletronicos("Radio", 220);
		ProdutosEletronicos p2 = new ProdutosEletronicos("Celular", 110);
	
		p1.visualizar();
		p2.visualizar();
	}
}
