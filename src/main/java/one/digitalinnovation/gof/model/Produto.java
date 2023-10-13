package one.digitalinnovation.gof.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Produto {

  @Id
  private Long id;
  private String nome;
  private String Descricao;
  private Double preco;
  @ManyToMany
  @JoinTable(
      name = "produto_vendido",
      joinColumns = @JoinColumn(name = "produto_id"),
      inverseJoinColumns = @JoinColumn(name = "cliente_id")
  )
  private List<Cliente> cliente;

  public List<Cliente> getCliente() {
    return cliente;
  }

  public void setCliente(List<Cliente> cliente) {
    this.cliente = cliente;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return Descricao;
  }

  public void setDescricao(String descricao) {
    Descricao = descricao;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }
}
