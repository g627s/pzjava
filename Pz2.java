package ru.mirea.lab1;

import java.util.*;

public class Pz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        if (n * 5 > 52) {
            System.out.println("Слишком много игроков!");
            return;
        }

        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        String[] deck = new String[52];
        int k = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = rank + suit;
            }
        }

        // перемешивание колоды
        for (int i = 0; i < deck.length; i++) {
            int j = (int)(Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        // раздача по 5 карт
        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck[i * 5 + j]);
            }
            System.out.println();
        }
    }
}
