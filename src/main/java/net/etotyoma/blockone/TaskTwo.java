package net.etotyoma.blockone;

import java.util.Calendar;
import java.util.Scanner;

/*
Напишите программу, в которой по году рождения определяется возраст
пользователя. Используйте консольный ввод и вывод.
*/

public class TaskTwo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter year you were born: ");
        int year = scanner.nextInt();

        int age = Calendar.getInstance().get(Calendar.YEAR) - year;
        System.out.printf("Your age is %d.", age);
    }
}
