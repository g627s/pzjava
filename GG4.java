package ru.mirea.lab1;
import java.util.Scanner;

public class GG4 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//считываем ввод юзера с клавиатуры

    System.out.print("Введите размер массива: ");
    int size = scanner.nextInt();//считывает целое число введенное юзером
    int[] array = new int[size];//новый объект в памяти

    System.out.println("Введите элементы массива:");
    for (int i = 0; i < size; i++) {
        array[i] = scanner.nextInt();
    }

    // Сумма через do while
    int sumDoWhile = 0;
    int i = 0;
    do {
        sumDoWhile += array[i];
        i++;
    } while (i < array.length);

    // Сумма через while
    int sumWhile = 0;
    int j = 0;
    while (j < array.length) {
        sumWhile += array[j];
        j++;
    }

    // Максимальный и минимальный элемент
    int max = array[0];
    int min = array[0];
    for (int k = 1; k < array.length; k++) {
        if (array[k] > max) max = array[k];
        if (array[k] < min) min = array[k];
    }

    System.out.println("Сумма (do while): " + sumDoWhile);
    System.out.println("Сумма (while): " + sumWhile);
    System.out.println("Максимальный: " + max);
    System.out.println("Минимальный: " + min);
}
}



