<<<<<<< HEAD
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClienteTest {
    @Test
    
    public void PrimeiroTeste() {
        assertThat(10, is(10));
    }

    @Test
    public void CriarNovoCliente (){
        Cliente cliente = new Cliente();
        cliente.nome   = "Lívia Eduarda";
        cliente.pais   = "Brasil";
        cliente.idade  = 11;

        Estado estado = new Estado(); //Objeto
        estado.nome = "São Paulo";
        estado.sigla = "SP";
        Cidade cidade = new Cidade();
        cidade.nome = "Guarulhos";
        cliente.estado = estado;
        cliente.cidade = cidade;
        cliente.setEstado(estado);
        cliente.setCidade(cidade);
        assertThat(cliente.nome, is("Lívia Eduarda"));
        assertThat(cliente.pais, is("Brasil"));
        assertThat(cliente.idade, is(11));
        assertThat(cliente.getEstado().nome, is("São Paulo"));
        assertThat(cliente.getCidade().nome, is("Guarulhos"));
    }

    @Test
    public void AtribuirNomeCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome("Lívia Eduarda");
        assertThat(cliente.nome, is("Lívia Eduarda"));
        assertThat(cliente.getNome(), is("Lívia Eduarda"));
    }

    @Test
    public void AtribuirCidadeCliente(){
        Cliente cliente = new Cliente();
        Cidade cidade = new Cidade();
        cidade.nome = "Guarulhos";
        assertThat(cidade.nome, is("Guarulhos"));
    }

    @Test
    public void AtribuirEstadoCliente(){
        Cliente cliente = new Cliente();
        Estado estado = new Estado();
        estado.sigla = "SP";
        assertThat(estado.sigla, is("SP"));
    }

    @Test
    public void AtribuirPaisCliente(){
        Cliente cliente = new Cliente();
        cliente.setPais("Brasil");
        assertThat(cliente.pais, is("Brasil"));
        assertThat(cliente.getPais(), is("Brasil"));
    }

    @Test
    public void AtribuirIdadeCliente(){
        Cliente cliente = new Cliente();
        cliente.setIdade(11);
        assertThat(cliente.idade, is(11));
        assertThat(cliente.getIdade(), is(11));
    }

}
=======
<<<<<<< HEAD
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClienteTest {
    @Test
    
    public void PrimeiroTeste() {
        assertThat(10, is(10));
    }

    @Test
    public void CriarNovoCliente (){
        Cliente cliente = new Cliente();
        cliente.nome   = "Lívia Eduarda";
        cliente.pais   = "Brasil";
        cliente.idade  = 11;

        Estado estado = new Estado(); //Objeto
        estado.nome = "São Paulo";
        estado.sigla = "SP";
        Cidade cidade = new Cidade();
        cidade.nome = "Guarulhos";
        cliente.estado = estado;
        cliente.cidade = cidade;
        cliente.setEstado(estado);
        cliente.setCidade(cidade);
        assertThat(cliente.nome, is("Lívia Eduarda"));
        assertThat(cliente.pais, is("Brasil"));
        assertThat(cliente.idade, is(11));
        assertThat(cliente.getEstado().nome, is("São Paulo"));
        assertThat(cliente.getCidade().nome, is("Guarulhos"));
    }

    @Test
    public void AtribuirNomeCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome("Lívia Eduarda");
        assertThat(cliente.nome, is("Lívia Eduarda"));
        assertThat(cliente.getNome(), is("Lívia Eduarda"));
    }

    @Test
    public void AtribuirCidadeCliente(){
        Cliente cliente = new Cliente();
        Cidade cidade = new Cidade();
        cidade.nome = "Guarulhos";
        assertThat(cidade.nome, is("Guarulhos"));
    }

    @Test
    public void AtribuirEstadoCliente(){
        Cliente cliente = new Cliente();
        Estado estado = new Estado();
        estado.sigla = "SP";
        assertThat(estado.sigla, is("SP"));
    }

    @Test
    public void AtribuirPaisCliente(){
        Cliente cliente = new Cliente();
        cliente.setPais("Brasil");
        assertThat(cliente.pais, is("Brasil"));
        assertThat(cliente.getPais(), is("Brasil"));
    }

    @Test
    public void AtribuirIdadeCliente(){
        Cliente cliente = new Cliente();
        cliente.setIdade(11);
        assertThat(cliente.idade, is(11));
        assertThat(cliente.getIdade(), is(11));
    }

}
=======
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClienteTest {
    @Test
    
    public void PrimeiroTeste() {
        assertThat(10, is(10));
    }

    @Test
    public void CriarNovoCliente (){
        Cliente cliente = new Cliente();
        cliente.nome   = "Lívia Eduarda";
        cliente.pais   = "Brasil";
        cliente.idade  = 11;

        Estado estado = new Estado(); //Objeto
        estado.nome = "São Paulo";
        estado.sigla = "SP";
        Cidade cidade = new Cidade();
        cidade.nome = "Guarulhos";
        cliente.estado = estado;
        cliente.cidade = cidade;
        cliente.setEstado(estado);
        cliente.setCidade(cidade);
        assertThat(cliente.nome, is("Lívia Eduarda"));
        assertThat(cliente.pais, is("Brasil"));
        assertThat(cliente.idade, is(11));
        assertThat(cliente.getEstado().nome, is("São Paulo"));
        assertThat(cliente.getCidade().nome, is("Guarulhos"));
    }

    @Test
    public void AtribuirNomeCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome("Lívia Eduarda");
        assertThat(cliente.nome, is("Lívia Eduarda"));
        assertThat(cliente.getNome(), is("Lívia Eduarda"));
    }

    @Test
    public void AtribuirCidadeCliente(){
        Cliente cliente = new Cliente();
        Cidade cidade = new Cidade();
        cidade.nome = "Guarulhos";
        assertThat(cidade.nome, is("Guarulhos"));
    }

    @Test
    public void AtribuirEstadoCliente(){
        Cliente cliente = new Cliente();
        Estado estado = new Estado();
        estado.sigla = "SP";
        assertThat(estado.sigla, is("SP"));
    }

    @Test
    public void AtribuirPaisCliente(){
        Cliente cliente = new Cliente();
        cliente.setPais("Brasil");
        assertThat(cliente.pais, is("Brasil"));
        assertThat(cliente.getPais(), is("Brasil"));
    }

    @Test
    public void AtribuirIdadeCliente(){
        Cliente cliente = new Cliente();
        cliente.setIdade(11);
        assertThat(cliente.idade, is(11));
        assertThat(cliente.getIdade(), is(11));
    }

}
>>>>>>> ba37c3c0fe83ee1f6613fb02adedb1f69a0cb72d
>>>>>>> Atualizando repositório
