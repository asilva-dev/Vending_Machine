public class Cidade {

    private String nome; //Alterei o tipo de String para Cidade
    private Estado estado; //criando objeto Estado


    public void setNome(String nome) throws NomeCidadeInvalidoException {
        if(nome.matches("^[0-9]*$") || nome.trim().isEmpty()) { //verificando se tem numeros na string (matches verifica o padrão)
            throw new NomeCidadeInvalidoException();
        }
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


