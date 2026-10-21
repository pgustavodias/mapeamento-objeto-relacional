package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import objects.Aluno;
import objects.Curso;

public class ClientAluno {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		// Consulta e recupera os cursos existentes
        Curso s = em.find(Curso.class, 1);
        Curso a = em.find(Curso.class, 2);
        
        // Instancia os alunos conforme o construtor informando nome e curso
        
        Aluno aluno1 = new Aluno("Ana", s);
        Aluno aluno2 = new Aluno("José", a);
        
        // Persiste no banco
        
        em.getTransaction().begin();
        em.persist(aluno1);
        em.persist(aluno2);
        em.getTransaction().commit();
        em.close();
        emf.close();
		
	}

}
