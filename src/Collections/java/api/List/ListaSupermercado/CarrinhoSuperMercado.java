package Collections.java.api.List.ListaSupermercado;

public class CarrinhoSuperMercado {
    //atributo
    private String produto;


    public CarrinhoSuperMercado(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }


    @Override
    public String toString() {
        return "CarrinhoSuperMercado :" +
                "produto='" + produto + " .";
    }
}
