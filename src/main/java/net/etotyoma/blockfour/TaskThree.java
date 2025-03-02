package net.etotyoma.blockfour;

import java.util.Scanner;

/*
Напишите программу, в которой создается символьный массив, а затем
порядок элементов в массиве меняется на обратный.
*/

public class TaskThree {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter chars without spacings: ");
        String str = scanner.next();

        char[] array = str.toCharArray();

        int left = 0;
        int right = array.length - 1;

        // Reverse order
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        for (char value : array)
            System.out.print(value + " ");
    }
}
