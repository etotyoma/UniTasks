package net.etotyoma.blockone;

import java.util.Scanner;

/*
Напишите программу, в которой пользователь вводит сначала имя,
а затем фамилию. Программа выводит сообщение с введенной
информацией.
*/

public class TaskOne {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        System.out.printf("Your full name is %s %s.", name, surname);
    }
}
