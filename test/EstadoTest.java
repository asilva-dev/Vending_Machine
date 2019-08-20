import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EstadoTest {
    @Test
    public void CriarEstado(){
        Estado estado = new Estado(); //Objeto Estado
        estado.nome = "Sao Paulo";
        assertThat(estado.nome, is("Sao Paulo"));
        estado.sigla = "SP";
        assertThat(estado.sigla, is("SP"));
    }





}
