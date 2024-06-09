package Main.java.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;
    //cria um construtor de lista de tarefas
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    //adiciona tarefas na lista
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    //remove tarefas selecionadas
    public void removerTarefa(String descricao){
       List<Tarefa> tarefazParaRemover = new ArrayList<>();
        for(Tarefa t :tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefazParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefazParaRemover);
    }
    //obtem o número de tarefas na lista
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }
    //obtem a lista de tarefas descritas e salvas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
