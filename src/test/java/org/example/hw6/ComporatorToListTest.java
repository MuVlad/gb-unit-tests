package org.example.hw6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

class ComporatorToListTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private ComporatorToList comporator;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
        comporator = new ComporatorToList();
    }

    @Test
    void averageValueAMoreAverageValueB() {

        List<Integer> listA = List.of(2, 4, 5, 7, 9, 6, 9);
        List<Integer> listB = List.of(2, 6, 5, 9, 7, 4);

        comporator.compareLists(listA, listB);
        Assertions.assertEquals("Первый список имеет большее среднее значение", outputStream.toString().trim());
    }

    @Test
    void averageValueBMoreAverageValueA() {

        List<Integer> listA = List.of(2, 4, 5, 7, 9, 6);
        List<Integer> listB = List.of(2, 6, 5, 9, 7, 4, 9);

        comporator.compareLists(listA, listB);
        Assertions.assertEquals("Второй список имеет большее среднее значение", outputStream.toString().trim());
    }
    @Test
    void averageValueBEqualAverageValueA() {

        List<Integer> listA = List.of(2, 4, 5, 7, 9, 6);
        List<Integer> listB = List.of(2, 6, 5, 9, 7, 4);

        comporator.compareLists(listA, listB);
        Assertions.assertEquals("Средние значения равны", outputStream.toString().trim());
    }

    @AfterEach
    public void cleanUp() {
        System.setOut(null);
    }
}