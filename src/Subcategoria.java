public class Subcategoria {

    private String unidMedida;
    private Categoria categoria; //objeto

    public String getUnidMedida() {
        return this.unidMedida;
    }

    public void setUnidMedida(String unidMedida)throws UnidadeMedidaInvalidaException {
        if (unidMedida.matches ("^[0-9]*$") || unidMedida.trim ().isEmpty ()){
            throw new UnidadeMedidaInvalidaException ();
        }
        this.unidMedida = unidMedida;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }





}
