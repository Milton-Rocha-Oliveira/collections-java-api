package Collections.java.api.Map.Agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
          numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Milton", 981434580);
        agendaContatos.adicionarContato("Juliete", 981434580);
        agendaContatos.adicionarContato("Milton", 981434580);
        agendaContatos.adicionarContato("Milton", 981434580);
        agendaContatos.adicionarContato("Milton", 981434580);

        agendaContatos.exibirContatos();

        System.out.println( "O numero é " + agendaContatos.pesquisarPorNome("Juliete"));
    }
}
