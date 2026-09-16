package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import objects.Produto;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		String novoNome = "Produto Novo";
		Integer novaCategoria = 10;
		
		em.getTransaction().begin();
		
		// Recuperação do produto que deseja-se atualizar
		Produto novo = em.find(Produto.class, 3);
		
		// Atribuição dos novos valores aos atributos
		novo.setNome(novoNome);
		novo.setCategoria(novaCategoria);
		
		// Efetivação da atualização no banco
		em.getTransaction().commit();
		
		// Encerramento da transação
		em.close();
		emf.close();

	}

}
