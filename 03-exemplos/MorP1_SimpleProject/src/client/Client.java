package client;

import objects.Produto;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciação dos objetos
		Produto p1 = new Produto(1, "Produto 1", 1);
		Produto p2 = new Produto(2, "Produto 2", 2);
		Produto p3 = new Produto(3, "Produto 3", 3);
		
		//Impressão dos objetos na tela através do método toString				
	    System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}


