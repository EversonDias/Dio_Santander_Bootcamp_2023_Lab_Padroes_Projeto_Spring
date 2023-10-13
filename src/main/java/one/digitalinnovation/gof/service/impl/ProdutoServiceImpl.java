package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Produto;
import one.digitalinnovation.gof.model.ProdutoReository;
import one.digitalinnovation.gof.service.ProdutoService;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

  private final ProdutoReository produtoReository;

  public ProdutoServiceImpl(ProdutoReository produtoReository) {
    this.produtoReository = produtoReository;
  }

  @Override
  public Produto criarNovoProduto(Produto produto) {
    return produtoReository.save(produto);
  }

  @Override
  public Iterable<Produto> listaProdutos() {
    return produtoReository.findAll();
  }
}
