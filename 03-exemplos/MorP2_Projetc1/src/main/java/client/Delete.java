package client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import objects.Produto;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		
		//Instanciando objeto do tipo Scanner para estabelecer interações
		Scanner s = new Scanner(System.in);		
		
		//Interagindo com o usuário para realizar a consulta do produto escolhido
		System.out.println("Informe o id do produto a ser consultado: ");
		Integer id = s.nextInt();
		
		//Iniciando interação com o banco
		em.getTransaction().begin();
		
		//Excluindo o registro
		Produto x = em.find(Produto.class, id);
		em.remove(x);
		em.getTransaction().commit();
		
		//encerrando a comunicação com o banco;
		em.close();
		emf.close();

	}

}
