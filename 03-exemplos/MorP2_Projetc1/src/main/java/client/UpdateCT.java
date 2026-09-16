package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import objects.Produto;


public class UpdateCT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		String novoNome = "Produto Novo";
		Integer novaCategoria = 10;
		
		EntityTransaction tx = em.getTransaction();

		try {

		    // 1. Início
		    tx.begin();

		    // 2. Unidade de trabalho
		    Produto produto = em.find(Produto.class, 3);

		    if (produto == null) {
		        throw new RuntimeException("Produto não encontrado.");
		    }

		    produto.setNome(novoNome);
		    produto.setCategoria(novaCategoria);

		    // 3. Finalização
		    tx.commit();

		} catch (RuntimeException e) {

		    // 4. Falha
		    if (tx.isActive()) {
		        tx.rollback();
		    }

		    throw e;

		} finally {

		    // 5. Liberação dos recursos
		    em.close();
		}
		
		emf.close();

	}
	

}
