import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CidadeTest {

    @Test
    public void CriarCidade() throws NomeCidadeInvalidoException, NomeEstadoInvalidoException, SiglaEstadoInvalidaException{
        Cidade cidade = new Cidade(); //Objeto
        cidade.setNome("Guarulhos");

        Estado estado = new Estado(); //Objeto
        estado.setNome("São Paulo");
        estado.setSigla("SP");

        cidade.setEstado(estado);

        assertThat(cidade.getNome(), is("Guarulhos"));
        assertThat(cidade.getEstado(), is(estado));
    }
    @Test (expected = NomeCidadeInvalidoException.class)
    public void invalidarNomeCidadeQuandoNumero() throws NomeCidadeInvalidoException{  //em algum fluxo retornara uma Exception
        Cidade cidade = new Cidade();
        cidade.setNome("10");
    }

    @Test (expected = NomeCidadeInvalidoException.class)
    public void invalidarNomeCidadeQuandoVazio() throws NomeCidadeInvalidoException{
        Cidade cidade = new Cidade();
        cidade.setNome("");
    }

    @Test (expected = NomeEstadoInvalidoException.class)
    public void invalidarNomeEstadoQuandoNumero()throws NomeEstadoInvalidoException{
        Estado estado = new Estado();
        estado.setNome("10");
    }

    @Test(expected = NomeEstadoInvalidoException.class)
    public void invalidarNomeEstadoQuandoVazio()throws NomeEstadoInvalidoException{
        Estado estado = new Estado();
        estado.setNome("");
    }
    
    @Test
    public void RetornarListaCidades() throws NomeEstadoInvalidoException, NomeCidadeInvalidoException, SiglaEstadoInvalidaException{
        List<Cidade> cidades = new ArrayList(); //criando o arraylist
        //declarando o estado
        Estado estado = new Estado();
        estado.setSigla("SP");
        estado.setNome("São Paulo");
        //declarando a cidade
        Cidade cidade = new Cidade();
        cidade.setNome("Guarulhos");
        cidade.setEstado(estado); //amarrando a cidade ao estado

        cidades.add(cidade); //add a cidade no arraylist
        assertThat(cidades.isEmpty(), is(false)); //
        assertThat(cidades.contains(cidade), is(true));
    }

}
