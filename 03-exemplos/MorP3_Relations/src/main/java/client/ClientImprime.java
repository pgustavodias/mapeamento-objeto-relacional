package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import objects.Aluno;
import objects.Disciplina;


public class ClientImprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		// Consulta o aluno e seu curso
        Aluno aluno = em.find(Aluno.class, 1);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso().getNome());

        // Consulta as disciplinas do aluno
        System.out.println("\nDisciplinas:");

        for (Disciplina disciplina : aluno.getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }

        em.close();

	}

}
