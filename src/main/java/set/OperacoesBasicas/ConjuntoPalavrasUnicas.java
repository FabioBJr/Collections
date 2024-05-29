package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> stringSet;

    public ConjuntoPalavrasUnicas() {
        this.stringSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        stringSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!stringSet.isEmpty()) {
            if (stringSet.contains(palavra)) {
                stringSet.remove(palavra);
            } else {
                System.out.println("Palavra ausente no conjunto!");
            }
        } else {
            System.out.println("O conjunto de palavras está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return stringSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!stringSet.isEmpty()) {
            System.out.println(stringSet);
        } else {
            System.out.println("O conjunto de palavras está vazio!");
        }
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Douglas");
        conjuntoPalavrasUnicas.adicionarPalavra("Fernando");
        conjuntoPalavrasUnicas.adicionarPalavra("Douglas");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Douglas");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
