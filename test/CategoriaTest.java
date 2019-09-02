import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CategoriaTest {

    @Test
    public void criarCategoria(){
        Categoria categoria = new Categoria();
        categoria.setTipo("Alimenticio");

        String tipo = "Alimenticio";
        categoria.setTipo(tipo);

        assertThat(categoria.getTipo(), is("Alimenticio"));

    }
}
