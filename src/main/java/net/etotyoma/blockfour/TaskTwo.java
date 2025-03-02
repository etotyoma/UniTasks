package net.etotyoma.blockfour;

/*
Напишите программу, а которой создается массив из 11-ти элементов.
Массив заполняется степенями двойки. Первый элемент массива равен
1. Отобразить массив в прямом и обратном порядках.
*/

public class TaskTwo {
    public static void main(String[] args) {
        int[] array = new int[11];
        array[0] = 1;

        for (int i = 1; i < array.length; i++) {
            array[i] = (int) Math.pow(2, i);
        }

        System.out.println("Ascending order:");
        for (int value : array)
            System.out.print(value + " ");

        System.out.println("\nDescending order:");
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}
