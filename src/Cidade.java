public class Cidade {

    String nome; //Alterei o tipo de String para Cidade
    Estado estado; //criando objeto Estado


    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome(){

        return this.nome;
    }

    public void setEstado(Estado estado) {

        this.estado = estado;
    }

    public Estado getEstado(){

        return this.estado;
    }


}


