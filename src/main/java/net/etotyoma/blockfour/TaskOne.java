package net.etotyoma.blockfour;

import java.util.Scanner;

/*
Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке
2. Размер массива вводится пользователем. Предусмотреть обработку
ошибки, связанной с вводом некорректного значения.
*/

public class TaskOne {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = 0;

        try {
            System.out.print("Enter size of array: ");
            size = scanner.nextInt();

            if (size <= 0)
                System.out.println("Array size must be greater than zero.");
        } catch (Exception e) {
            System.out.println("Something went wrong... Try again!");
        }

        int[] array = new int[size];
        int number = 2;
        // Starting with 2, 2 % 5 = 2 -> can always add 5 to get same remainder
        for (int i = 0; i < size; i++) {
            array[i] = number;
            number += 5;
        }
        // Display the result array
        for (int value : array)
            System.out.print(value + " ");
    }
}
