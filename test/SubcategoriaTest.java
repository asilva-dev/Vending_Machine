import org.junit.Test;
import org.junit.internal.builders.JUnit3Builder;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SubcategoriaTest {

    @Test
    public void criarSubcategoria() throws UnidadeMedidaInvalidaException{
        Subcategoria subcategoria = new Subcategoria();
        Categoria categoria = new Categoria(); //Objeto

        subcategoria.setUnidMedida("Liquido");
        categoria.setTipo("Alimenticio");

        String unidMedida = "Liquido";
        subcategoria.setUnidMedida(unidMedida);
        subcategoria.setCategoria(categoria);

        assertThat(subcategoria.getUnidMedida(),is("Liquido"));
        assertThat(subcategoria.getCategoria().getTipo(),is("Alimenticio"));
        subcategoria.setCategoria(categoria); //amarrando a categoria na subcategoria
    }

    @Test
    public void retornarListaSubcategorias() throws UnidadeMedidaInvalidaException{
        List<Subcategoria> subcategorias = new ArrayList();
        Subcategoria subcategoria = new Subcategoria();
        subcategoria.setUnidMedida("Liquido");

        Categoria categoria = new Categoria(); //Objeto
        categoria.setTipo("Alimenticio");
        subcategoria.setCategoria(categoria);

        subcategorias.add(subcategoria);

    }
}
