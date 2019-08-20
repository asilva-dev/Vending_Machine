import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EstoqueTest {
    @Test
    public void CriarProdutoEstoque() {
            Estoque estoque = new Estoque();
            Produto produto = new Produto(); //novo produto da classe "Produto"
            Categoria categoria = new Categoria(); //novo produto da classe "Categoria"
            Subcategoria subcategoria = new Subcategoria(); //novo produto da classe "Subcategoria"

            //Criando o produto e atribuindo ao estoque
            produto.nome = "Suco de Frutas Vermelhas";
            estoque.produto = produto;
            estoque.quantidade = 5;
            categoria.tipo = "Alimenticio";
            subcategoria.unidMedida = "Liquido";

            //Testando o "set" do produto {Set modifica o atributo}
            estoque.setProduto(produto);
            estoque.setCategoria(categoria);
            estoque.setSubcategoria(subcategoria);
            estoque.setQuantidade(estoque.quantidade);

            //Testando o "get" do produto {Get acessa o atributo 'pega'}
            assertThat(estoque.getProduto().nome, is("Suco de Frutas Vermelhas"));
            assertThat(estoque.getCategoria().tipo, is("Alimenticio"));
            assertThat(estoque.getSubcategoria().unidMedida, is("Liquido"));
            assertThat(estoque.getQuantidade(), is(5));
        }
    }
