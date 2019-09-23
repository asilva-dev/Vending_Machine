import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EstadoTest {
    @Test
    public void CriarEstado() throws Exception{
        Estado estado = new Estado(); //Objeto Estado
        estado.setNome("Sao Paulo");
        estado.setSigla("SP");

        assertThat(estado.getNome(),is("Sao Paulo"));
        assertThat(estado.getSigla(),is("SP"));
    }

    @Test
    public void criarListaCidadesPorEstado()throws NomeEstadoInvalidoException{
        Estado estado = new Estado();
        Cidade cidade = new Cidade();

        estado.setNome("Sao Paulo");
        cidade.setNome("Guarulhos");
        cidade.setEstado(estado);

        estado.setCidade(cidade);

        //Verificando se a cidade está no indice chamado
        assertThat(estado.getCidades().get(0).getNome(),is("Guarulhos"));
        assertThat(estado.getCidades().get(0).getEstado().getNome(),is("Sao Paulo"));
    }
    @Test (expected = NomeEstadoInvalidoException.class)
    public void invalidarNomeEstadoQuandoNumero() throws NomeEstadoInvalidoException{  //em algum fluxo retornara uma Exception
        Estado estado = new Estado();
        estado.setNome("10");
    }

    @Test (expected = NomeEstadoInvalidoException.class)
    public void invalidarNomeEstadoQuandoVazio() throws NomeEstadoInvalidoException{
        Estado estado = new Estado();
        estado.setNome("");

    }

}
