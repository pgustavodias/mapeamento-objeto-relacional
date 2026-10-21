package objects;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;

    // Relacionamento com a entidade Curso
    // Um curso possui muitos alunos matriculados
    @OneToMany(mappedBy = "curso")
    
    // Arraylist necessário para acessar os alunos matriculados e um curso 
    private List<Aluno> alunos = new ArrayList<>();

    public Curso() {
    }
    
    public Curso(String nome) {
    	this.nome = nome;
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

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
