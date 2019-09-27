import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PedidoTest {

    @Test
    public void CriarNovoPedido() throws NomeClienteInvalidoException, NomeProdutoInvalidoException{
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente();
        Produto produto = new Produto();

        cliente.setNome("Livia");
        pedido.setCliente(cliente);
        produto.setNome("Suco de Frutas Vermelhas");

        pedido.setProduto(produto);
        pedido.setCliente(cliente);

        assertThat(pedido.getCliente().getNome(),is("Livia"));
        assertThat(pedido.getProduto().getNome(), is("Suco de Frutas Vermelhas"));
    }
}