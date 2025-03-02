package net.etotyoma.blocktwo;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра слева в 10-ном
представлении числа).
*/

public class TaskThree {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        number /= 1000;
        System.out.printf("Your number has %d thousands.", number);
    }
}
