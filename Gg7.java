package ru.mirea.lab1;
import java.util.Scanner;
public class Gg7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt(); // Считываем число от пользователя

        int result = 1; // Начальное значение факториала
        for (int i = 1; i <= number; i++) {
            result *= i; // Умножаем результат на текущее число
        }

        System.out.println("Факториал " + number + " = " + result); // Выводим результат
    }
}