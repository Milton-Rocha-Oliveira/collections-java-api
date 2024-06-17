package Collections.java.api.List.ListaLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    //atributo
    private List<Livro> livroList;
    //Cria uma lista vazia com um catalago de livros

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    //Adiciona os livros em uma lista
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Faz uma busca na lista de livros, e retorna o
    // resultado de uma busca por nome do autor do livro
    //que foi inserido atraves de uma entrada tipo String
    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //Faz uma busca na lista de livros, e retorna o
    // resultado de uma busca por ano de lançamento do livro
    //que foi inserido atraves de uma entrada de dois tipos Int
    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

        public static void main (String[]args){

            CatalagoLivros catalagoLivros = new CatalagoLivros();

            catalagoLivros.adicionarLivro("Deus não está morto", "...", 2012);
            catalagoLivros.adicionarLivro("O amor mais louco da historia", "Deive Leonardo", 2022);
            catalagoLivros.adicionarLivro("Deus não está morto", "...", 2012);
            catalagoLivros.adicionarLivro("Cristianismo puro e simples", "C.S Lewis", 1985);
            catalagoLivros.adicionarLivro("Andando na preseça", "PR Michel", 2000);
            catalagoLivros.adicionarLivro("Revolução dos bichos", "George Orwell", 1980);

            System.out.println("Intervalos de anos...");
            System.out.println(catalagoLivros.pesquisaPorIntervaloDeAnos(1950, 2000));
            System.out.println("Busca por titulo....");
            System.out.println(catalagoLivros.pesquisaPorTitulo("Deus não está morto"));
            System.out.println("Pesquisa por autor....");
            System.out.println(catalagoLivros.pesquisaPorAutor("C.S Lewis"));
        }
    }