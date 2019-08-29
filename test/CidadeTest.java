import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CidadeTest {

    @Test
    public void CriarCidade(){
        Cidade cidade = new Cidade(); //Objeto
        cidade.nome = "Guarulhos";

        Estado estado = new Estado(); //Objeto
        estado.nome = "São Paulo";
        estado.sigla = "SP";
        cidade.estado = estado;

        cidade.setNome(cidade);
        assertThat(cidade.getNome(), is("Guarulhos"));

        cidade.setEstado(estado);
        assertThat(cidade.getEstado(), is(estado));
    }

    @Test
    public void RetornarListaCidades(){
        List<Cidade> cidades = new ArrayList(); //criando o arraylist
        //declarando o estado
        Estado estado = new Estado();
        estado.sigla = "SP";
        estado.nome = "São Paulo";
        //declarando a cidade
        Cidade cidade = new Cidade();
        cidade.nome = "Guarulhos";
        cidade.estado = estado; //amarrando a cidade ao estado

        cidades.add(cidade); //add a cidade no arraylist
        assertThat(cidades.isEmpty(), is(false)); //
        assertThat(cidades.contains(cidade), is(true));

    }
}
