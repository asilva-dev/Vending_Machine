import org.junit.Test;
import org.junit.internal.builders.JUnit3Builder;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SubcategoriaTest {

    @Test
    public void criarSubcategoria(){
        Subcategoria subcategoria = new Subcategoria();
        Categoria categoria = new Categoria(); //Objeto

        subcategoria.unidMedida = "Liquido";
        categoria.tipo = "Alimenticio";

        String unidMedida = "Liquido";
        subcategoria.setUnidMedida(unidMedida);
        subcategoria.setCategoria(categoria);

        assertThat(subcategoria.getUnidMedida(),is("Liquido"));
        assertThat(subcategoria.getCategoria().tipo,is("Alimenticio"));
        subcategoria.categoria = categoria; //amarrando a categoria na subcategoria


    }

    @Test
    public void retornarListaSubcategorias(){
        List<Subcategoria> subcategorias = new ArrayList();
        Subcategoria subcategoria = new Subcategoria();
        subcategoria.unidMedida = "Liquido";

        Categoria categoria = new Categoria(); //Objeto
        categoria.tipo = "Alimenticio";
        subcategoria.categoria = categoria;

        subcategorias.add(subcategoria);

    }
}
