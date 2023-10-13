package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Produto;
import one.digitalinnovation.gof.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoRestController {

  @Autowired
  private final ProdutoService produtoService;

  public ProdutoRestController(ProdutoService produtoService) {
    this.produtoService = produtoService;
  }

  @GetMapping()
  public ResponseEntity<Iterable<Produto>> listaProdutos() {
    Iterable<Produto> data = produtoService.listaProdutos();
    return ResponseEntity.status(HttpStatus.OK).body(data);
  }

  @PostMapping()
  public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
    Produto data = produtoService.criarNovoProduto(produto);
    return ResponseEntity.status(HttpStatus.CREATED).body(data);
  }
}
