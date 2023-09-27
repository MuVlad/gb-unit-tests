package org.example.hw6;

import java.util.List;

public class ComporatorToList {
    public static void compareLists(List<Integer> a, List<Integer> b) {

        double averageA = a.stream().mapToInt(value -> value).average().orElse(0);
        double averageB = b.stream().mapToInt(value -> value).average().orElse(0);

        double result = averageA - averageB;

        if (result > 0) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (result < 0) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }
}
