package net.etotyoma.blockone;

import java.util.Scanner;

/*
Напишите программу, в которой пользователь вводит число, а
программа выводит последовательность из 3 чисел: число -1, число,
число +1.
*/

public class TaskFour {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        // If it works - it works :)
        System.out.printf("The sequence is %d, %d, %d.", --number, ++number, ++number);
    }
}
