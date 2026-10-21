package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import objects.Curso;

public class ClientCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		
		// Instancia os cursos
		Curso curso1 = new Curso();
        curso1.setNome("Sistemas de Informação");

        Curso curso2 = new Curso();
        curso2.setNome("Administração");

        // Persiste no banco         
        em.getTransaction().begin();
        em.persist(curso1);
        em.persist(curso2);
        em.getTransaction().commit();
        em.close();
        emf.close();
		

	}

}
