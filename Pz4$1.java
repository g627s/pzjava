package ru.mirea.lab1;

abstract class Furniture {
    String material;
    double price;

    public Furniture(String material, double price) {
        this.material = material;
        this.price = price;
    }

    public abstract void showInfo();
}

class Chair extends Furniture {
    public Chair(String material, double price) {
        super(material, price);
    }
    public void showInfo() {
        System.out.println("Стул: " + material + ", цена = " + price);
    }
}

class Table extends Furniture {
    public Table(String material, double price) {
        super(material, price);
    }
    public void showInfo() {
        System.out.println("Стол: " + material + ", цена = " + price);
    }
}

public class Pz4$1 {
    public static void main(String[] args) {
        Furniture f1 = new Chair("дерево", 1200);
        Furniture f2 = new Table("металл", 5000);

        System.out.println("Ассортимент магазина:");
        f1.showInfo();
        f2.showInfo();
    }
}
