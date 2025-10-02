package ru.mirea.lab1;

import java.util.Scanner;

public class Pz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Введите размер массива (натуральное число > 0): ");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.print("Некорректное значение! Введите снова: ");
            n = sc.nextInt();
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * (n + 1)); // от 0 до n
        }

        System.out.println("Первый массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) count++;
        }

        if (count > 0) {
            int[] evenArr = new int[count];
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    evenArr[k] = arr[i];
                    k++;
                }
            }

            System.out.println("Второй массив (чётные):");
            for (int i = 0; i < count; i++) {
                System.out.print(evenArr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Чётных элементов нет.");
        }
    }
}
