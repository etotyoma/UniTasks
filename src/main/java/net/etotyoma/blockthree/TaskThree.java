package net.etotyoma.blockthree;

import java.util.Scanner;

/*
Напишите программу, в которой пользователь вводит целое число в
диапазоне от 1 до 7, а программа определяет по этому числу день недели.
Если число выходит за рамки допустимого диапазона, выводится
соответствующее предупреждение. Предложите механизм обработки
ошибки, в случае ввода нечислового значения.
*/

public class TaskThree {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter your number from 1 to 7: ");
            int number = scanner.nextInt();
            String day = null;

            switch (number) {
                case 1 -> day = "Monday";
                case 2 -> day = "Tuesday";
                case 3 -> day = "Wednesday";
                case 4 -> day = "Thursday";
                case 5 -> day = "Friday";
                case 6 -> day = "Saturday";
                case 7 -> day = "Sunday";
                default -> System.out.println("Wrong number, only 7 days in a week");
            }

            if (number >= 1 && number <= 7)
                System.out.printf("The day is %s.", day);
        } catch (Exception e) {
            System.out.println("Something went wrong... Try again!");
        }
    }
}
