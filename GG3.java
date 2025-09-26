package ru.mirea.lab1;

public class GG3 {
    public static void main(String[] args) {
        // Инициализация массива как в Си
        int[] array = {5, 10, 15, 20, 25, 30};

        // Вычисление суммы элементов
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Вычисление среднего арифметического
        double average = (double) sum / array.length;

        // Вывод результатов
        System.out.println("Массив: " + java.util.Arrays.toString(array));
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}