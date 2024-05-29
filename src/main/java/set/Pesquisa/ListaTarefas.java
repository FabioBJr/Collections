package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
          tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaSet.remove(t);
                } else {
                    System.out.println("Tarefa não encontrada!");
                }
            }
        } else {
            throw new RuntimeException("Nenhuma tarefa adicionada!");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            throw new RuntimeException("Nenhuma tarefa adicionada!");
        }
    }

    public void contarTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet.size());
        } else {
            throw new RuntimeException("Nenhuma tarefa adicionada!");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida() == true) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            throw new RuntimeException("Nenhuma tarefa adicionada!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida() == false) {
                    tarefasPendentes.add(t);
                }
            }
        } else {
            throw new RuntimeException("Nenhuma tarefa adicionada!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                    System.out.println("Tarefa concluida!");
                }
            }
        } else {
            throw new RuntimeException("Nenhuma tarefa adicionada!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(false);
                    System.out.println("Tarefa pendente!");
                }
            }
        } else {
            throw new RuntimeException("Nenhuma tarefa adicionada!");
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("desc1");
        listaTarefas.adicionarTarefa("desc2");
        listaTarefas.adicionarTarefa("desc1");
        listaTarefas.adicionarTarefa("desc4");
        listaTarefas.adicionarTarefa("desc5");

        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("desc2");

        System.out.println(listaTarefas.obterTarefasPendentes());

    }
}
