package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import objects.Aluno;
import objects.Disciplina;


public class ClientMatricula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		// Consulta e recupera os alunos
        Aluno a1 = em.find(Aluno.class, 1);
        Aluno a2 = em.find(Aluno.class, 2);

        // Consulta e recupera as disciplinas
        Disciplina d1 = em.find(Disciplina.class, 1);
        Disciplina d2 = em.find(Disciplina.class, 2);
        Disciplina d3 = em.find(Disciplina.class, 3);
        
        
        em.getTransaction().begin();
        
        // Matricula o aluno 1 nas três disciplinas
        a1.getDisciplinas().add(d1);
        a1.getDisciplinas().add(d2);
        a1.getDisciplinas().add(d3);
        
        
        // Matricula o aluno 2 na disciplina 2
        a2.getDisciplinas().add(d2);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        

	}

}
