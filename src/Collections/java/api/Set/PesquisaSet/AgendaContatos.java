package Collections.java.api.Set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo

    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome , int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato>pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome,int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c:contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[]args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Milton", 981434580);
        agendaContatos.adicionarContato("Milton Rocha", 981434580);
        agendaContatos.adicionarContato("Milto", 981434580);
        agendaContatos.adicionarContato("Milon", 981434580);
        agendaContatos.adicionarContato("Milton", 981434580);
        agendaContatos.adicionarContato("Milton", 981434580);
        agendaContatos.adicionarContato("Milton", 981434580);
        agendaContatos.adicionarContato("Milton", 981434580);
        agendaContatos.adicionarContato("Milton", 981434580);

        agendaContatos.exibirContatos();

        System.out.println("Pesquisa nome"+ agendaContatos.pesquisaPorNome("Milton"));

        System.out.println("Atualizar contato" + agendaContatos.atualizarNumeroContato("Milton Rocha",981821868));

        agendaContatos.exibirContatos();
    }
}
