package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import objects.Disciplina;

public class ClientDisciplina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		
		//Instancia as disciplinas
		Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Banco de Dados");

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Administração");

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setNome("Engenharia de Software");
        
        
        //Persiste no banco
        em.getTransaction().begin();
        em.persist(disciplina1);
        em.persist(disciplina2);
        em.persist(disciplina3);
        em.getTransaction().commit();
        em.close();
        emf.close();

	}

}
