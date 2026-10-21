package objects;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;

    
    // Relacionamento Inverso com a entidade Alunos
    // Muitos alunos possuem matrícula em muitas disciplinas 
    @ManyToMany(mappedBy = "disciplinas")
    
    // Arraylist necessário para acessar os alunos de uma disciplina
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina() {
    }
    
    public Disciplina(String nome) {
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
