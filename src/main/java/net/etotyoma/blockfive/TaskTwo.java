package net.etotyoma.blockfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
Напишите программу со статическим методом, аргументом которому
передается произвольное количество целочисленных аргументов.
Результатом метод возвращает массив из двух элементов: это значения
наибольшего и наименьшего значений среди аргументов, переданных
методу.
*/

public class TaskTwo {
    public static void main(String[] args) {
        // You can pass any numbers in method
        System.out.println(Arrays.toString(findMaxAndMin(3, 5, 66, 231, 4, -21, -3)));
        // Output: [-21, 231]
    }

    private static int[] findMaxAndMin(int... numbers) {
        // From regular array to ArrayList, then sorting in natural order
        ArrayList<Integer> arr = new ArrayList<>(numbers.length);
        for (int i : numbers)
            arr.add(i);
        arr.sort(Comparator.naturalOrder());

        return new int[] {arr.getFirst(), arr.getLast()};
    }
}
