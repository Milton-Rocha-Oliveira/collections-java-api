package Collections.java.api.Set.ControleDeConvite;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;
    //Cria uma lista HashSet da classe convidado
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    //adiciona convidado na lista
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }
    //Remove um candidado da lista, usando como base o codigo do convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
            convidadoSet.remove(convidadoParaRemover);
        }
    }
    //retorna a quantia de convidados da lista
    public int contarConvidados(){
        return convidadoSet.size();
    }
    //Exibe a lista dos convidados na tela
    public void exibirConviados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Milton",1234);
        conjuntoConvidados.adicionarConvidado("Juliete",1237);
        conjuntoConvidados.adicionarConvidado("Maria",1235);
        conjuntoConvidados.adicionarConvidado("Eduardo",1235);
        conjuntoConvidados.adicionarConvidado("Otavio",12346);
        conjuntoConvidados.adicionarConvidado("Milton Rocha",1238);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1238);
        System.out.println("Quantidade de convidados");
        System.out.println(conjuntoConvidados.contarConvidados());
        System.out.println("Excluir convidado");
        System.out.println("Lista de convidados");
        conjuntoConvidados.exibirConviados();
    }
}
