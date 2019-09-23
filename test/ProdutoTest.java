import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProdutoTest {
    @Test
    public void criarNovoProduto() {
        //acessando os métodos
        Produto produto = new Produto();
        produto.setNome("Suco de Frutas Vermelhas");
        produto.setPreco(10.40);

        Categoria categoria = new Categoria();
        categoria.setTipo("Alimenticio");

        Subcategoria subcategoria = new Subcategoria();
        subcategoria.setUnidMedida("Liquido");
        produto.setCategoria(categoria);
        produto.setSubcategoria(subcategoria);

        assertThat(produto.getNome(), is("Suco de Frutas Vermelhas"));
        assertThat(produto.getPreco(), is(10.40));
    }

    @Test
    public void atribuirNomeProduto(){
        Produto produto = new Produto();
        String nome = "suco";
        produto.setNome(nome);
        assertThat(produto.getNome(), is("suco"));
    }

    @Test
    public void atribuirPrecoProduto(){
        Produto produto = new Produto();
        produto.setPreco(10.40);
        Double preco = 10.40;
        produto.setPreco(preco);
        assertThat(produto.getPreco(), is(10.40));
        assertThat(produto.getPreco(), is(10.40));
    }

    @Test
    public void AtribuirCategoriaProduto(){
        Produto produto = new Produto();
        Categoria categoria = new Categoria();
        categoria.setTipo("Alimenticio");
        produto.setCategoria(categoria);
        produto.setCategoria(categoria);
        assertThat(categoria.getTipo(), is("Alimenticio"));
    }

    @Test
    public void AtribuirSubcategoriaProduto(){
        Produto produto = new Produto();
        Subcategoria subcategoria = new Subcategoria();
        subcategoria.setUnidMedida("Liquido");
        produto.setSubcategoria(subcategoria);
        produto.setSubcategoria(subcategoria);
        assertThat(subcategoria.getUnidMedida(), is ("Liquido"));
    }
}
