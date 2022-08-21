package com.generatio.collections;

import java.util.ArrayList;

public class TestaCollections {

	public static void main(String[] args) {
		
		ArrayList <String> estoque = new ArrayList<String>();
		
		estoque.add("Arroz");
		estoque.add("Farinha");
		estoque.add("Feijão");
		estoque.add("Ovo");
		estoque.add("Leite");
		
		System.out.println(estoque);
		
		estoque.remove(3);
		System.out.println(estoque);
		
		estoque.add("Açucar");
		System.out.println(estoque);
		
		

	}

}
