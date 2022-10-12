package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeDeclarative {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sum();
        remove();

    }

    public static void sum() {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(" Imperative approach  " + sum);

        /**
         * Declarative Style of Programming
         */
        sum = IntStream.rangeClosed(0, 100).sum();
        System.out.println(" Declarative approach  " + sum);
        // parallel
        sum = IntStream.rangeClosed(0, 100).parallel().sum();
    }

    public static void remove() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5);
        // imperative approach
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer currentInteger : integerList) {
            if (!uniqueList.contains(currentInteger)) uniqueList.add(currentInteger);
        }
        // declarative appraoach
        List<Integer> uniqueList2 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        List<Integer> test = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

    }
}