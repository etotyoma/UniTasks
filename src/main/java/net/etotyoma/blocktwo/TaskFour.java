package net.etotyoma.blocktwo;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число в диапазон от 5 до 10 включительно.
*/

public class TaskFour {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number >= 5 && number <= 10)
            System.out.println("Your number <= 10 and >= 5");
        else
            System.out.println("Your number is lesser than 5 or greater than 10");
    }
}
