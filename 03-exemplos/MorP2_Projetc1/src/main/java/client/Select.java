package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import objects.Produto;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		//iniciando a transação com o banco
		em.getTransaction().begin();
		
		//localizando o objeto
		em.find(Produto.class, 1);
		
		//imprimindo o objeto na tela
		System.out.println(em.find(Produto.class, 1));
		
		//encerrando a comunicação com o banco;
		em.close();
		emf.close();
		
		

	}

}
