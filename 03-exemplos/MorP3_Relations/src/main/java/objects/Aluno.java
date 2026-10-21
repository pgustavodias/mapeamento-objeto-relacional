package objects;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    
    
    // Relacionamento com a entidade Curso
    // Muitos alunos possuem matrícula em um curso
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    // Relacionamento Proprietário com a entidade Disciplina
    // Muitos alunos possuem matrícula em muitas disciplinas 
    @ManyToMany
    @JoinTable(
        name = "aluno_disciplina",
        joinColumns = @JoinColumn(name = "id_aluno"),
        inverseJoinColumns = @JoinColumn(name = "id_disciplina")
    )
    
    // Arraylist para acessar as disciplinas nas quais o aluno está matriculado
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno() {
    }
    
    // Construtor do aluno recebe um objeto do tipo Curso
    // Ele será a chave estrangeira para o relacionamento 
    public Aluno(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
