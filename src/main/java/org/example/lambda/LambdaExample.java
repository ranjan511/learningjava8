package org.example.lambda;

import java.util.Comparator;

/**
 * Lambda :- Function without name / Anonymous function
 * Not tied to any class like regular method
 * Can also be assigned to variable and passed around as variable
 * <p>
 * (Input) -> {Lambda body }
 * used to implement Functional Interfaces
 * SAM Single Abstract method Interfaces
 * <p>
 * Functonal Interfaces :- Runnable, Comparator
 */

public class LambdaExample {

    public static void main(String[] args) {
        System.out.println("Hello Lambda!");
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
    }


}
