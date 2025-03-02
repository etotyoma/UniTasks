package net.etotyoma.blocktwo;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: при делении на 5 в остатке
получается 2, а при делении на 7 в остатке получается 1.
*/

public class TaskTwo {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number % 5 == 2 && number % 7 == 1)
            System.out.println("The number satisfies all the conditions");
        else
            System.out.println("The number does not satisfy all the conditions");
    }
}
