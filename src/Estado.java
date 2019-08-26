import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.List;


public class Estado {

    String sigla, nome;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public  String getSigla(){
        return this.sigla;
    }
    public String setSigla(String sigla){
        return this.sigla;
    }


    List<Cidade> cidades;


}