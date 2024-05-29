package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> numbersList = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numbersList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenatedNumbersAsc = new ArrayList<>(numbersList);
        Collections.sort(ordenatedNumbersAsc);
        return ordenatedNumbersAsc;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenatedNumbersDsc = new ArrayList<>(numbersList);
        ordenatedNumbersDsc.sort(Collections.reverseOrder());
        return ordenatedNumbersDsc;
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(-3);
        ordenacaoNumeros.adicionarNumero(7);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}


