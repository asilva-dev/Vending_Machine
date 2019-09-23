public class Pedido {

    //Atributos do pedido
    private Cliente cliente;
    private Produto produto;


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
