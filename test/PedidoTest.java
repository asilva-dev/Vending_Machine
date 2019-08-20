import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PedidoTest {

    @Test
    public void CriarNovoPedido(){
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente();
        Produto produto = new Produto();

        cliente.nome = "Livia";
        pedido.cliente = cliente;
        produto.nome = "Suco de Frutas Vermelhas";

        pedido.setProduto(produto);
        pedido.setCliente(cliente);
        assertThat(pedido.getCliente().nome,is("Livia"));
        assertThat(pedido.getProduto().nome, is("Suco de Frutas Vermelhas"));
    }
}