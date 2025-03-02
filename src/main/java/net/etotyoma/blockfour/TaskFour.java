package net.etotyoma.blockfour;

import java.util.Scanner;

/*
Напишите программу, вычисляющую сколько положительных и/или
отрицательных чисел в массиве. Массив (и его длина) задается
пользователем.
*/

public class TaskFour {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter numbers with spacings or commas: ");
        String input = scanner.nextLine();

        String[] elements = input.split("[ ,]+");
        int[] array = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        int positive = 0;
        int negative = 0;

        for (int num : array) {
            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
    }
}
