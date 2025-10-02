package ru.mirea.lab1;

import java.util.Scanner;

enum Catalog { ELECTRONICS, CLOTHES, FOOD }

enum Electronics { PHONE, LAPTOP, HEADPHONES }
enum Clothes { TSHIRT, JEANS, JACKET }
enum Food { BREAD, MILK, APPLE }

public class Pz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // аутентификация
        System.out.print("Введите логин: ");
        String login = sc.nextLine();
        System.out.print("Введите пароль: ");
        String pass = sc.nextLine();
        if (!login.equals("user") || !pass.equals("123")) {
            System.out.println("Ошибка входа");
            return;
        }

        String[] cart = new String[20];
        int count = 0;

        while (true) {
            System.out.println("\nКаталоги: ");
            for (Catalog c : Catalog.values()) System.out.println("- " + c);
            System.out.print("Введите каталог (или EXIT): ");
            String cat = sc.nextLine().toUpperCase();
            if (cat.equals("EXIT")) break;

            if (cat.equals("ELECTRONICS")) {
                for (Electronics e : Electronics.values()) System.out.println("- " + e);
                System.out.print("Выберите товар: ");
                String p = sc.nextLine().toUpperCase();
                for (Electronics e : Electronics.values())
                    if (e.name().equals(p)) cart[count++] = p;
            } else if (cat.equals("CLOTHES")) {
                for (Clothes e : Clothes.values()) System.out.println("- " + e);
                System.out.print("Выберите товар: ");
                String p = sc.nextLine().toUpperCase();
                for (Clothes e : Clothes.values())
                    if (e.name().equals(p)) cart[count++] = p;
            } else if (cat.equals("FOOD")) {
                for (Food e : Food.values()) System.out.println("- " + e);
                System.out.print("Выберите товар: ");
                String p = sc.nextLine().toUpperCase();
                for (Food e : Food.values())
                    if (e.name().equals(p)) cart[count++] = p;
            } else {
                System.out.println("Нет такого каталога!");
            }
        }

        System.out.println("\nКорзина:");
        if (count == 0) System.out.println("пуста");
        else {
            for (int i = 0; i < count; i++) System.out.println("- " + cart[i]);
            System.out.println("Спасибо за покупку!");
        }
    }
}
