package net.etotyoma.blockthree;

import java.util.Scanner;

/*
Напишите программу, выводящую последовательности Фибоначчи.
Количество чисел – указывается пользователем. Предложите разные
версии программы с разными операторами цикла.
*/

public class TaskFive {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        int num1 = 0, num2 = 1;

        for (int i = 0; i < number; i++) {
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
}
