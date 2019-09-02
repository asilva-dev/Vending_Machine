import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EstadoTest {
    @Test
    public void CriarEstado(){
        Estado estado = new Estado(); //Objeto Estado
        estado.setNome("Sao Paulo");
        estado.setSigla("SP");

        assertThat(estado.getNome(),is("Sao Paulo"));
        assertThat(estado.getSigla(),is("SP"));
    }

    @Test
    public void criarListaCidadesPorEstado(){
        Estado estado = new Estado();
        Cidade cidade = new Cidade();

        estado.setNome("Sao Paulo");
        cidade.setNome("Guarulhos");
        cidade.setEstado(estado);
        estado.cidades.add(cidade); //Colocar o add dentro de um método de incluir cidade

        //Verificando se a cidade está no indice chamado
        assertThat(estado.cidades.get(0).getNome(),is("Guarulhos"));
        assertThat(estado.cidades.get(0).estado.getNome(),is("Sao Paulo"));
    }
}
