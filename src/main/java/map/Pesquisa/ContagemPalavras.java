package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contadorPalavras;

    public ContagemPalavras() {
        this.contadorPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contadorPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contadorPalavras.isEmpty()) {
            contadorPalavras.remove(palavra);
        } else {
            System.out.println("Nenhuma palavra adicionada.");
        }
    }

    public int exibircontagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : contadorPalavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String econtrarPalavraMaisFrequente(String palavra) {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contadorPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }
}
