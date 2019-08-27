public class Produto {

    private String nome;
    Double preco;
    Categoria categoria; //Objeto categoria
    Subcategoria subcategoria; //Objeto categoria

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome(){

        return nome;
    }

    public void setPreco(Double preco){

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

