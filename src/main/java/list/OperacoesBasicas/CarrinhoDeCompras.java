package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String name, double price, int amount) {
        Item item = new Item(name, price, amount);
        this.carrinhoList.add(item);
    }

    public void removerItem(String name) {
        List<Item> itensParaRemover = new ArrayList<>();
        if(!carrinhoList.isEmpty()) {
            for(Item i : carrinhoList) {
                if (i.getName().equalsIgnoreCase(name)) {
                    itensParaRemover.add(i);
                }
            }
            carrinhoList.removeAll(itensParaRemover);
        }
        else {
            System.out.println("A lista esta vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!carrinhoList.isEmpty()) {
            for (Item item : carrinhoList) {
                valorTotal += item.getPrice() * item.getAmount();
            }
            return valorTotal;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
       if(!carrinhoList.isEmpty()) {
           System.out.println(this.carrinhoList);
       }
       else {
           System.out.println("A lista esta vazia!");
       }


    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinho=" + carrinhoList +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinho.adicionarItem("Lápis", 2, 3);
        carrinho.adicionarItem("Lápis", 2, 3);
        carrinho.adicionarItem("Caderno", 35, 1);
        carrinho.adicionarItem("Borracha", 2, 2);

        // Exibindo os itens no carrinho
        carrinho.exibirItens();

        // Removendo um item do carrinho
        carrinho.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinho.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());
    }
}
