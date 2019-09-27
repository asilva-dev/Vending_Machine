import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EstoqueTest{

    @Test
    public void CriarProdutoEstoque() throws NomeProdutoInvalidoException, UnidadeMedidaInvalidaException, QuatidadeEstoqueInvalidaException{
            Estoque estoque = new Estoque();

            Produto produto = new Produto(); //novo produto da classe "Produto"
            produto.setNome("Suco de Frutas Vermelhas");

            Categoria categoria = new Categoria(); //novo produto da classe "Categoria"
            categoria.setTipo("Alimenticio");

            Subcategoria subcategoria = new Subcategoria(); //novo produto da classe "Subcategoria"
            subcategoria.setUnidMedida("Liquido");

            estoque.setQuantidade(5);

            //Testando o "set" do produto {Set modifica o atributo}
            estoque.setProduto(produto);
            estoque.setCategoria(categoria);
            estoque.setSubcategoria(subcategoria);

            //Testando o "get" do produto {Get acessa o atributo 'pega'}
            assertThat(estoque.getProduto().getNome(), is("Suco de Frutas Vermelhas"));
            assertThat(estoque.getCategoria().getTipo(), is("Alimenticio"));
            assertThat(estoque.getSubcategoria().getUnidMedida(), is("Liquido"));
            assertThat(estoque.getQuantidade(), is(5));
        }

    @Test (expected = NomeProdutoInvalidoException.class)
    public void invalidarNomeProdutoQuandoNumero() throws NomeProdutoInvalidoException{  //em algum fluxo retornara uma Exception
        Produto produto = new Produto ();
        produto.setNome("10");
    }

    @Test (expected = NomeProdutoInvalidoException.class)
    public void invalidarNomeProdutoQuandoVazio() throws NomeProdutoInvalidoException{
        Produto produto = new Produto ();
        produto.setNome("");
    }


    }
