import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EstadoTest {
    @Test
    public void CriarEstado(){
        Estado estado = new Estado(); //Objeto Estado
        estado.nome = "Sao Paulo";
        estado.sigla = "SP";

        String nome = "Sao Paulo";
        estado.setNome(nome);
        String sigla = "SP";
        estado.setSigla(sigla);

        assertThat(estado.getNome(),is("Sao Paulo"));
        assertThat(estado.getSigla(),is("SP"));
        assertThat(estado.nome, is("Sao Paulo"));
        assertThat(estado.sigla, is("SP"));
    }





}
