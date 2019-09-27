public class Estoque {

    //Criando objetos que virão de outras classes
    Produto produto;
    Categoria categoria;
    Subcategoria subcategoria;
    Integer quantidade;
    
    public Produto getProduto() {
        return this.produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public  Categoria getCategoria(){
        return  this.categoria;
    }
    public void  setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public Subcategoria getSubcategoria(){
        return  this.subcategoria;
    }
    public void setSubcategoria(Subcategoria subcategoria){
        this.subcategoria = subcategoria;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) throws QuatidadeEstoqueInvalidaException {
        if(quantidade.equals("^[a-zA-Z]*$")){ //verificando se tem numeros na string (matches verifica o padrão)
            throw new QuatidadeEstoqueInvalidaException ();
        }
        this.quantidade = quantidade;
    }
}
