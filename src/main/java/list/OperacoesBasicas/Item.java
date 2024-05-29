package main.java.list.OperacoesBasicas;

public class Item {

    public String name;
    public double price;
    public int amount;

    public Item(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
