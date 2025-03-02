package net.etotyoma.blockfive;

/*
Напишите программу со статическим методом, которому передается
текст и произвольное количество символьных аргументов, результатом
возвращается текст, который получается добавлением в конец
исходного текста (первый аргумент метода) символьных значений,
пересланных аргументами методу.
*/

public class TaskOne {
    public static void main(String[] args) {
        String originalText = "Hello";
        String finalText = appendChars(originalText, ' ', 'W', 'o', 'r', 'l', 'd', '!');

        System.out.println("Result: " + finalText);
    }

    public static String appendChars(String text, char... chars) {
        StringBuilder result = new StringBuilder(text);

        for (char c : chars) {
            result.append(c);
        }

        return result.toString();
    }
}
