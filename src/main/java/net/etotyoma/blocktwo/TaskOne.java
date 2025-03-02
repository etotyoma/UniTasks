package net.etotyoma.blocktwo;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, делится ли введенное число
на 3.
*/

public class TaskOne {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0)
            System.out.println("Your number is dividable by 3.");
        else
            System.out.println("Your number is NOT dividable by 3.");
    }
}
