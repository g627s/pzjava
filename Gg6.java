package ru.mirea.lab1;

public class Gg6 {public static void main(String[] args) {
    System.out.println("Первые 10 чисел гармонического ряда:");

    for (int n = 1; n <= 10; n++) {
        double z = 0.0;
        for (int i = 1; i <= n; i++) {
            z += 1.0 / i; // Суммируем дроби
        }
        // Простой вывод без сложного форматирования
        System.out.println("H(" + n + ") = " + z);
    }
}
}

