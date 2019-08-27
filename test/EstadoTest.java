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

    @Test
    public void criarListaCidadesPorEstado(){
        Estado estado = new Estado();
        Cidade cidade = new Cidade();

        estado.nome = "Sao Paulo";
        cidade.nome = "Guarulhos";
        cidade.setEstado(estado);
        estado.cidades.add(cidade); //Colocar o add dentro de um método de incluir cidade

        //Verificando se a cidade está no indice chamado
        assertThat(estado.cidades.get(0).nome,is("Guarulhos"));
        assertThat(estado.cidades.get(0).estado.nome,is("Sao Paulo"));
    }
}
