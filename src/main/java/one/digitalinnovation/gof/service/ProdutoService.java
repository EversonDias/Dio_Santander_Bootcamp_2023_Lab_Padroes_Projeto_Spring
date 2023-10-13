package one.digitalinnovation.gof.service;

import java.util.List;
import one.digitalinnovation.gof.model.Produto;

public interface ProdutoService {
  Produto criarNovoProduto(Produto produto);

  Iterable<Produto> listaProdutos();
}
