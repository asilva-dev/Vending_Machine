import org.junit.Test;
<<<<<<< HEAD
=======

>>>>>>> Atualizando repositório
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CategoriaTest {

    @Test
    public void criarCategoria(){
        Categoria categoria = new Categoria();
        categoria.tipo = "Alimenticio";
        assertThat(categoria.tipo, is("Alimenticio"));
    }
}
