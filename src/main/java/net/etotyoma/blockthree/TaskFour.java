package net.etotyoma.blockthree;

import java.util.Scanner;

/*
Напишите программу вычисления суммы нечетных чисел. Предложите
разные версии программы с разными операторами цикла.
*/

public class TaskFour {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0)
                sum += i;
        }

        System.out.printf("The sum off all odd numbers is %d.", sum);
    }
}
