package Collections.java.api.Map.Estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long, Produto> estoqueProdutosMap;
    //Metodo constructor
    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }
    //Adiciona produtos no estoque
    public void adicionarProduto(long cod,String nome, double preco,int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome,preco,quantidade));
    }
    //Exibe produtos do estoque
    public void exibirProduto(){
        if(!estoqueProdutosMap.isEmpty()){
            System.out.println(estoqueProdutosMap);
        }else{
            System.out.println("O ESTOQUE ESTA VAZIO");
        }
    }
    //Calcula valor total de estoque
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0.0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    //Obtem o produto mais caro levando em consideração o valor e a quantidade de produto no estoque. Exemplo 5 produtos
    //no valor de 5 reais torna o produto de valor 25 reais no estoque
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco =0.0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args){
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProduto();

        estoqueProdutos.adicionarProduto(1,"Prudto a ", 5.0,5);
        estoqueProdutos.adicionarProduto(2,"Produto B",10.0,1);
        estoqueProdutos.adicionarProduto(3,"Produto c",10.5,2);
        estoqueProdutos.adicionarProduto(4,"Produto d",1.5,1);

        estoqueProdutos.exibirProduto();
        System.out.println("Valor total de estoque " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
