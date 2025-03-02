package net.etotyoma.blockthree;

import java.util.Scanner;

/*
Напишите программу, в которой пользователь вводит число, а
программа проверяет, делится ли это число на 3 и на 7. Дополнительно
добавьте обработку исключений.
*/

public class TaskOne {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter your number: ");
            int number = scanner.nextInt();

            if (number % 3 == 0 && number % 7 == 0)
                System.out.println("Your number is dividable by 3 and 7");
            else
                System.out.println("Your number is not dividable either by 3 or 7");
        } catch (Exception e) {
            System.out.println("Something went wrong... Try again!");
        }
    }
}
