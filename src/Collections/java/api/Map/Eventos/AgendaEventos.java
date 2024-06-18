package Collections.java.api.Map.Eventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {this.eventoMap = new HashMap<>(); }
    //Metodo para adicionar Eventos em uma lista
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento (nome, atracao));
    }
    //Exibindo a agenda completa
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }
    /* Abaixo temos uma forma de buscarmos qual sera o proximo evento
    * tem tres formas que não dariam certo com Set e Collections
    * e tem a forma que é a mais recomendada que é LocalDate.now */
    public void obterProximoEvento(){
        /*Set<LocalDate> dateSet = eventoMap.keySet();
        Collection<Evento> value = new eventosMap.values();*/
        //eventoMap.get()
        //Os acima não retornam a data atual, a forma correta é a que esta abaixo, atravez do localDate
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        /* Cria um TreeMap, pegando como parametro LocalDate e Evento,
        * eo laço for percore toda a lista de eventosMap, e dentro do laço for,
        * compara as datas para ver se elas são iguais ou maiores que a data atual,
        * e retorna o valor do evento que sera realizado na data mais proxima */
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecera na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String [] args){
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 6 ,15), "Atracao 1", "Morada 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 5 ,15), "Atracao 1", "Morada 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6 ,15), "Atracao 1", "Morada 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12 ,15), "Atracao 1", "Morada 4");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
