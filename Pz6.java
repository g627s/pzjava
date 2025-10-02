package ru.mirea.lab1;

interface Priceable {
    double getPrice();
}

class Car implements Priceable {
    double price;

    public Car(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Book implements Priceable {
    double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class Pz6 {
    public static void main(String[] args) {
        Priceable c = new Car(3500000);
        Priceable b = new Book(500);

        System.out.println("Цена машины: " + c.getPrice());
        System.out.println("Цена книги: " + b.getPrice());
    }
}
