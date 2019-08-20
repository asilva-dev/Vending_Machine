<<<<<<< HEAD
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProdutoTest {

    @Test
    public void criarNovoProduto() {
        Produto produto = new Produto();
        produto.nome = "Suco de Frutas Vermelhas";
        produto.preco = 10.40;

        Categoria categoria = new Categoria();
        categoria.tipo = "Alimenticio";

        Subcategoria subcategoria = new Subcategoria();
        subcategoria.unidMedida = "Liquido";
        produto.categoria = categoria;
        produto.subcategoria = subcategoria;

        assertThat(produto.nome, is("Suco de Frutas Vermelhas"));
        assertThat(produto.preco, is(10.40));
    }

    @Test
    public void atribuirNomeProduto(){
        Produto produto = new Produto();
        produto.setNome("suco");
        assertThat(produto.nome, is("suco"));
        assertThat(produto.getNome(), is("suco"));
    }

    @Test
    public void atribuirPrecoProduto(){
        Produto produto = new Produto();
        produto.setPreco(10.40);
        assertThat(produto.preco, is(10.40));
        assertThat(produto.getPreco(), is(10.40));
    }

    @Test
    public void AtribuirCategoriaProduto(){
        Produto produto = new Produto();
        Categoria categoria = new Categoria();
        categoria.tipo = "Alimenticio";
        produto.categoria = categoria;
        produto.setCategoria(categoria);
        assertThat(categoria.tipo, is("Alimenticio"));
        assertThat(produto.getCategoria().tipo, is("Alimenticio")); //pegando o tipo do objeto categoria que está dentro de produto
    }

    @Test
    public void AtribuirSubcategoriaProduto(){
        Produto produto = new Produto();
        Subcategoria subcategoria = new Subcategoria();
        subcategoria.unidMedida = "Liquido";
        produto.subcategoria = subcategoria;
        produto.setSubcategoria(subcategoria);
        assertThat(subcategoria.unidMedida, is ("Liquido"));
        assertThat(produto.getSubcategoria().unidMedida, is("Liquido"));
    }
}
=======
<<<<<<< HEAD
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProdutoTest {

    @Test
    public void criarNovoProduto() {
        Produto produto = new Produto();
        produto.nome = "Suco de Frutas Vermelhas";
        produto.preco = 10.40;

        Categoria categoria = new Categoria();
        categoria.tipo = "Alimenticio";

        Subcategoria subcategoria = new Subcategoria();
        subcategoria.unidMedida = "Liquido";
        produto.categoria = categoria;
        produto.subcategoria = subcategoria;

        assertThat(produto.nome, is("Suco de Frutas Vermelhas"));
        assertThat(produto.preco, is(10.40));
    }

    @Test
    public void atribuirNomeProduto(){
        Produto produto = new Produto();
        produto.setNome("suco");
        assertThat(produto.nome, is("suco"));
        assertThat(produto.getNome(), is("suco"));
    }

    @Test
    public void atribuirPrecoProduto(){
        Produto produto = new Produto();
        produto.setPreco(10.40);
        assertThat(produto.preco, is(10.40));
        assertThat(produto.getPreco(), is(10.40));
    }

    @Test
    public void AtribuirCategoriaProduto(){
        Produto produto = new Produto();
        Categoria categoria = new Categoria();
        categoria.tipo = "Alimenticio";
        produto.categoria = categoria;
        produto.setCategoria(categoria);
        assertThat(categoria.tipo, is("Alimenticio"));
        assertThat(produto.getCategoria().tipo, is("Alimenticio")); //pegando o tipo do objeto categoria que está dentro de produto
    }

    @Test
    public void AtribuirSubcategoriaProduto(){
        Produto produto = new Produto();
        Subcategoria subcategoria = new Subcategoria();
        subcategoria.unidMedida = "Liquido";
        produto.subcategoria = subcategoria;
        produto.setSubcategoria(subcategoria);
        assertThat(subcategoria.unidMedida, is ("Liquido"));
        assertThat(produto.getSubcategoria().unidMedida, is("Liquido"));
    }
}
=======
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProdutoTest {

    @Test
    public void criarNovoProduto() {
        Produto produto = new Produto();
        produto.nome = "Suco de Frutas Vermelhas";
        produto.preco = 10.40;

        Categoria categoria = new Categoria();
        categoria.tipo = "Alimenticio";

        Subcategoria subcategoria = new Subcategoria();
        subcategoria.unidMedida = "Liquido";
        produto.categoria = categoria;
        produto.subcategoria = subcategoria;

        assertThat(produto.nome, is("Suco de Frutas Vermelhas"));
        assertThat(produto.preco, is(10.40));
    }

    @Test
    public void atribuirNomeProduto(){
        Produto produto = new Produto();
        produto.setNome("suco");
        assertThat(produto.nome, is("suco"));
        assertThat(produto.getNome(), is("suco"));
    }

    @Test
    public void atribuirPrecoProduto(){
        Produto produto = new Produto();
        produto.setPreco(10.40);
        assertThat(produto.preco, is(10.40));
        assertThat(produto.getPreco(), is(10.40));
    }

    @Test
    public void AtribuirCategoriaProduto(){
        Produto produto = new Produto();
        Categoria categoria = new Categoria();
        categoria.tipo = "Alimenticio";
        produto.categoria = categoria;
        produto.setCategoria(categoria);
        assertThat(categoria.tipo, is("Alimenticio"));
        assertThat(produto.getCategoria().tipo, is("Alimenticio")); //pegando o tipo do objeto categoria que está dentro de produto
    }

    @Test
    public void AtribuirSubcategoriaProduto(){
        Produto produto = new Produto();
        Subcategoria subcategoria = new Subcategoria();
        subcategoria.unidMedida = "Liquido";
        produto.subcategoria = subcategoria;
        produto.setSubcategoria(subcategoria);
        assertThat(subcategoria.unidMedida, is ("Liquido"));
        assertThat(produto.getSubcategoria().unidMedida, is("Liquido"));
    }
}
>>>>>>> ba37c3c0fe83ee1f6613fb02adedb1f69a0cb72d
>>>>>>> Atualizando repositório
