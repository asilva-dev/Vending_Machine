public class Cliente {

    private String nome, pais;
    private Integer idade;
    private Estado estado; //Objeto estado
    private Cidade cidade; //Objeto Cidade

    public void setNome(String nome) throws NomeClienteInvalidoException {
        if(nome.matches("^[0-9]*$") || nome.trim().isEmpty()) { //verificando se tem numeros na string (matches verifica o padrão)
            throw new NomeClienteInvalidoException();
        }
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {return pais;}

    public void setIdade(Integer idade)throws IdadeClienteInvalidaException {
        if(idade == null){ //verificando se tem numeros na string (matches verifica o padrão)
            throw new IdadeClienteInvalidaException();
        }
        this.idade = idade;
    }

    public Integer getIdade()  {

        return idade;
    }
}
