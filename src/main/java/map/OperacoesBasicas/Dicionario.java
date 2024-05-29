package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String descricao) {
       dicionarioMap.put(palavra, descricao);
    }

    public void removePalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Dicionario vazio.");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String descricaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            descricaoPorPalavra = dicionarioMap.get(palavra);
            if (descricaoPorPalavra == null) {
                System.out.println("Palavra não encontrada.");
            }
        } else{
            System.out.println("Dicionario vazio.");
        }
        return descricaoPorPalavra;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("dancar", "verbo");
        dicionario.adicionarPalavra("sol", "estrela");
        dicionario.adicionarPalavra("bone", "roupa");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("bone"));

        dicionario.removePalavra("dancar");
        dicionario.exibirPalavras();
    }
}
