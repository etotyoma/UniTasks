package net.etotyoma.blockthree;

import java.util.Scanner;

public class TaskTwo {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter your first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter your second number: ");
            int num2 = scanner.nextInt();

            if (num1 > num2)
                System.out.printf("%d is greater than %d.", num1, num2);
            else if (num1 < num2)
                System.out.printf("%d is lesser than %d.", num1, num2);
            else
                System.out.printf("%d is equal to %d.", num1, num2);
        } catch (Exception e) {
            System.out.println("Something went wrong... Try again!");
        }
    }
}
