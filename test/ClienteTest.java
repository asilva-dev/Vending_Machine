import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClienteTest {
    @Test
    public void CriarNovoCliente ()throws NomeClienteInvalidoException, NomeEstadoInvalidoException, NomeCidadeInvalidoException, IdadeClienteInvalidaException, SiglaEstadoInvalidaException{
        Cliente cliente = new Cliente(); //Objeto
        cliente.setNome("Lívia Eduarda");
        cliente.setPais("Brasil");
        cliente.setIdade(11);

        Estado estado = new Estado(); //Objeto
        estado.setNome("São Paulo");
        estado.setSigla("SP");
        Cidade cidade = new Cidade();
        cidade.setNome("Guarulhos");
        cliente.setEstado(estado);
        cliente.setCidade(cidade);

        String nome = "Lívia Eduarda";
        cliente.setNome(nome);
        Integer idade = 11;
        cliente.setIdade(idade);
        String pais = "Brasil";
        cliente.setPais(pais);
        cliente.setEstado(estado);
        cliente.setCidade(cidade);

        assertThat(cliente.getNome(), is("Lívia Eduarda"));
        assertThat(cliente.getIdade(), is(11));
        assertThat(cliente.getEstado().getNome(), is("São Paulo"));
        assertThat(cliente.getCidade().getNome(), is("Guarulhos"));
        assertThat(cliente.getPais(), is("Brasil"));
    }

    @Test
    public void AtribuirNomeCliente() throws NomeClienteInvalidoException {
        Cliente cliente = new Cliente();
        cliente.setNome("Lívia Eduarda");
        assertThat(cliente.getNome(), is("Lívia Eduarda"));
        assertThat(cliente.getNome(), is("Lívia Eduarda"));
    }
    @Test (expected = NomeClienteInvalidoException.class)
    public void invalidarNomeClienteQuandoNumero() throws NomeClienteInvalidoException{  //em algum fluxo retornara uma Exception
        Cliente cliente = new Cliente();
        cliente.setNome("10");
    }

    @Test (expected = NomeClienteInvalidoException.class)
    public void invalidarNomeClienteQuandoVazio() throws NomeClienteInvalidoException{
        Cliente cliente = new Cliente();
        cliente.setNome("");
    }

    @Test
    public void AtribuirCidadeCliente() throws NomeCidadeInvalidoException{
        Cliente cliente = new Cliente();
        Cidade cidade = new Cidade();
        cidade.setNome("Guarulhos");

        assertThat(cidade.getNome(), is("Guarulhos"));
    }

    @Test
    public void AtribuirEstadoCliente() throws SiglaEstadoInvalidaException{
        Cliente cliente = new Cliente ();
        Estado estado = new Estado();
        estado.setSigla("SP");
        assertThat(estado.getSigla(), is("SP"));
    }

    @Test
    public void AtribuirPaisCliente(){
        Cliente cliente = new Cliente();
        cliente.setPais("Brasil");

        assertThat(cliente.getPais(), is("Brasil"));
        assertThat(cliente.getPais(), is("Brasil"));
    }

    @Test
    public void AtribuirIdadeCliente() throws IdadeClienteInvalidaException{
        Cliente cliente = new Cliente();
        cliente.setIdade(11);
        assertThat(cliente.getIdade(), is(11));
        assertThat(cliente.getIdade(), is(11));
    }

}

