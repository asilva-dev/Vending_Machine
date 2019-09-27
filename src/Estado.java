import java.util.ArrayList;
import java.util.List;


public class Estado {

    private String sigla, nome;


    public void setSigla(String sigla) throws SiglaEstadoInvalidaException{
        if (sigla.matches("^[0-9]*$") || sigla.trim().isEmpty()){
            throw  new SiglaEstadoInvalidaException();
        }
        this.sigla = sigla;
    }

    public  String getSigla(){

        return this.sigla;
    }

    public void setNome(String nome) throws NomeEstadoInvalidoException{
        if(nome.matches("^[0-9]*$") || nome.trim().isEmpty()) { //verificando se tem numeros na string (matches verifica o padrão)
            throw new NomeEstadoInvalidoException();
        }
        this.nome = nome;
    }

    public String getNome() {

        return this.nome;
    }

    Cidade cidade = new Cidade();

    private List<Cidade> cidades = new ArrayList<Cidade>();

    public List<Cidade> getCidades() {
        return this.cidades;
    }

    //encapsulando a cidade
    public void setCidade(Cidade cidade){

        this.cidades.add(cidade);
    }

}