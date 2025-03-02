package net.etotyoma.blockfive;

import java.util.Scanner;

/*
Напишите программу, в которой описан статический метод для
вычисления двойного факториала. Например 6!! = 6 * 4 * 2 = 48,
5!! = 5 * 3 * 1 = 15. Предложите версию метода без рекурсии и с
рекурсией.
*/

public class TaskThree {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number < 0)
            System.out.println("Number must be greater than zero.");
        else
            // You can use either of two methods
            System.out.printf("%d!! equals %d.", number, doubleFactorialRecursive(number));
    }

    private static int doubleFactorialIterative(int num) {
        int result = 1;
        for (int i = num; i > 0; i-=2) {
            result *= i;
        }

        return result;
    }

    private static int doubleFactorialRecursive(int num) {
        if (num == 0 || num == 1)
            return 1;

        return num * doubleFactorialRecursive(num - 2);
    }
}
