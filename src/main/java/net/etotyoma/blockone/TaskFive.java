package net.etotyoma.blockone;

import java.util.Scanner;

/*
Напишите программу, вычисляющую сумму и разность введенных двух
чисел.
*/

public class TaskFive {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        System.out.printf("The sum is %d.\n", sum);
        System.out.printf("The sub is %d.", sub);
    }
}
