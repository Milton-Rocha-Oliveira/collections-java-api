package Main.java.ListaSupermercado;

import java.util.ArrayList;
import java.util.List;

public class ListaItens {
    //atributo
    private List<CarrinhoSuperMercado> listaItens;
    //Criando lista de itens no carrinho
    public ListaItens() {
        this.listaItens = new ArrayList<>();
    }
    //adicionar produto no carrinho
    public void adicionarItensCarrinho(String produto){
        listaItens.add(new CarrinhoSuperMercado(produto));
    }
    //remover produtos do carrinho
    public void removerProduto(String produto){
        List<CarrinhoSuperMercado> removerProduto = new ArrayList<>();
        for(CarrinhoSuperMercado c: listaItens){
            if(c.getProduto().equalsIgnoreCase(produto)){
                removerProduto.add(c);
            }
        }
        listaItens.removeAll(removerProduto);
    }
    //retorna quantidade de produtos no carrinho
    public int quantidadeItens(){
       return  listaItens.size();
    }
    //imprimi na tela a lista de itens adicionados no carrinho
    public void listaProdutos(){
        System.out.println(listaItens);
    }
    public static void main(String[] args){
        ListaItens listaItens = new ListaItens();

        listaItens.listaProdutos();
        listaItens.adicionarItensCarrinho("Arroz");
        listaItens.adicionarItensCarrinho("Feijão");
        listaItens.adicionarItensCarrinho("Açucar");
        listaItens.adicionarItensCarrinho("Carne");
        listaItens.adicionarItensCarrinho("Nutella");
        listaItens.adicionarItensCarrinho("Frutas");
        listaItens.listaProdutos();
        System.out.println("Quantidade de produtos no carrinho : " + listaItens.quantidadeItens());
        listaItens.removerProduto("Arroz");
        System.out.println("Quantidade de produtos no carrinho : " + listaItens.quantidadeItens());
        listaItens.listaProdutos();
    }
}
