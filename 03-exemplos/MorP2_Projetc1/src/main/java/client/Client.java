package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import objects.Produto;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		// Instanciação dos objetos
		Produto p1 = new Produto("Produto 1", 1);
		Produto p2 = new Produto("Produto 2", 2);
		Produto p3 = new Produto("Produto 3", 3);
		
		//Impressão dos objetos na tela através do método toString				
	    System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		//Persistindo no Banco de Dados
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}


