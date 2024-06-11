package Collections.java.api.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;
    //Cria uma lista
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    //Adiciona pessoas em uma lista, com as informações de nome, idade e altura
    public void adicionarPessoa(String nome,int idade,double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }
    //Cria uma lista de pessoa, baseada em uma lista ja criada, e as ordena baseando-se na idade
    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    //Cria uma lista de pessoa, baseada em uma lista ja criada, e as ordena baseando-se na altura
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>();
        pessoaPorAltura.sort(new CompararPorAltura());
        return pessoaPorAltura;
    }
    public static void main(String[] args){
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Milton",33,1.89);
        ordenacaoPessoa.adicionarPessoa("Otavio",4,1.07);
        ordenacaoPessoa.adicionarPessoa("Juliete",35,1.75);
        ordenacaoPessoa.adicionarPessoa("Eduardo",18,1.79);
        ordenacaoPessoa.adicionarPessoa("Maria",58,1.60);

        System.out.println("Ordenando pessoas por idade");
        System.out.println(ordenacaoPessoa.ordenadoPorIdade());

        System.out.println("Ordenando pessoas por altura");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.pessoaList);
    }
}
