import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EstoqueTest{

    @Test
    public void CriarProdutoEstoque() {
            Produto produto = new Produto(); //novo produto da classe "Produto"
            produto.setNome("Suco de Frutas Vermelhas");

            Estoque estoque = new Estoque();
            estoque.produto = produto;

            Categoria categoria = new Categoria(); //novo produto da classe "Categoria"
            categoria.setTipo("Alimenticio");

            Subcategoria subcategoria = new Subcategoria(); //novo produto da classe "Subcategoria"
            subcategoria.setUnidMedida("Liquido");

            estoque.quantidade = 5;

            //Testando o "set" do produto {Set modifica o atributo}
            estoque.setProduto(produto);
            estoque.setCategoria(categoria);
            estoque.setSubcategoria(subcategoria);
            Integer quantidade = 5;
            estoque.setQuantidade(quantidade);

            //Testando o "get" do produto {Get acessa o atributo 'pega'}
            assertThat(estoque.getProduto().getNome(), is("Suco de Frutas Vermelhas"));
            assertThat(estoque.getCategoria(), is("Alimenticio"));
            assertThat(estoque.getSubcategoria(), is("Liquido"));
            assertThat(estoque.getQuantidade(), is(5));
        }
    }
