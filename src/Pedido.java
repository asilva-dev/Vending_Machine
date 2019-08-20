public class Pedido {

    Cliente cliente;
    Produto produto;

    public Cliente getCliente(){

        return this.cliente;
    }
    public void setCliente(Cliente cliente){

        this.cliente = cliente;
    }


    public  Produto getProduto(){

        return this.produto;
    }
    public void setProduto(Produto produto) {

        this.produto = produto;
    }
}
