package Collections.java.api.Set.Produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
    public static void main(String[]args){
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123456,"Bolacha",2.50,5);
        cadastroProdutos.adicionarProduto(126,"Bolacha",2.50,5);
        cadastroProdutos.adicionarProduto(123456,"Bolacha",2.50,5);
        cadastroProdutos.adicionarProduto(3456,"Bolacha negresco",2.50,5);
        cadastroProdutos.adicionarProduto(1456,"Bolacha maizena",4.50,5);
        cadastroProdutos.adicionarProduto(12346,"Bolacha oreo",5.50,5);
        cadastroProdutos.adicionarProduto(126,"Bolacha Passatempo",2.50,5);

        System.out.println(cadastroProdutos.exibirPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    }
}
