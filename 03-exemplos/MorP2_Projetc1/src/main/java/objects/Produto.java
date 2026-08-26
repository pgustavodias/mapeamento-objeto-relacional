package objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	  // Declaração dos atributos do objeto
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Integer cod;
	  @Column(name="nomeprod")
	  private String nome;
	  @Column(name="categprod")
	  private Integer categoria;		  
	  
	  /* Construtor 
	   * O papel principal do construtor em Java é 
	   * inicializar um objeto no momento em que ele é 
	   * criado na memória. 
	   * 
	   * Suas funções essenciais incluem: 
	   *  - definir valores iniciais para os atributos; 
	   *  - executar regras de validação obrigatórias; e 
	   *  - preparar a instância para uso imediato.
       */			  
	  public Produto(String  nome, 
					 Integer categoria) {
	    this.nome = nome;
		this.categoria = categoria;
	  }
	  
	  /* Métodos Get e Set
	   * servem para acessar e modificar os atributos privados 
	   * de uma classe de forma segura. 
	   * 
	   * O get pega o valor do dado, 
	   * o set altera esse valor, e 
	   * juntos eles formam a base do conceito de encapsulamento.
	   */

	  public Integer getCod() {
	    return cod;
	  }

	  public void setCod(Integer cod) {
		this.cod = cod;
	  }

	  public String getNome() {
		return nome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  public Integer getCategoria() {
		return categoria;
	  }

	  public void setCategoria(Integer categoria) {
	    this.categoria = categoria; 
	  }
	  
	  // Método toString com objetivo de imprimir o objeto instanciado na tela

	  @Override
	  public String toString() {
	    return "Produto [nome=" + nome + ", categoria=" + categoria + "]"; 
	  }

}
