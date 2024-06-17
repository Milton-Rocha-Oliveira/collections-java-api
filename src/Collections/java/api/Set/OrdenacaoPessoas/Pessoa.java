package Collections.java.api.Set.OrdenacaoPessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    //atributo
    private String nome;
    private int idade;
    private double altura;
    //Metodo construtor que cria um objeto pessoa com as 3 informações de nome, idade e altura
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    //Faz a comparação de uma lista por idade
    public int compareTo(Pessoa p) {
        return Integer.compare(idade,p.getIdade());
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

}
//Como acima ja fizemos a implementação do COMPARABLE, devemos criar
//uma nova clase separada para podermos fazer a implementação do COMPARATOR.
class CompararPorAltura implements Comparator<Pessoa>{

    //Com a implementação do COMPARATOR, criamos uma comparação que
    // faz a comparação de dois parametros, e ordena por altura
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(),p2.getAltura());
    }
}
