public class Produto {

    private String nome;
    private Double preco;
    private Categoria categoria; //Objeto categoria
    private Subcategoria subcategoria; //Objeto categoria

    public void setNome(String nome) throws  NomeProdutoInvalidoException{
        if (nome.matches ("^[0-9]*$") || nome.trim ().isEmpty ()){
            throw new NomeProdutoInvalidoException ();
        }
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(Double preco) throws PrecoProdutoInvalidoException{
        if(preco.equals("^[a-zA-Z]*$")){ //verificando se tem numeros na string (matches verifica o padrão)
            throw new PrecoProdutoInvalidoException ();
        }
        this.preco = preco;
    }

    public Double getPreco(){
        return preco;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setSubcategoria(Subcategoria subcategoria){
        this.subcategoria = subcategoria;
    }

    public Subcategoria getSubcategoria(){
        return subcategoria;
    }
}

