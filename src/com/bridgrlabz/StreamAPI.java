package com.bridgrlabz;

import java.util.stream.Stream;

//Write a Java program that uses the Stream API to compute the average of all elements in a list of doubles.
public class StreamAPI {
    public static void main(String[] args) {
        Double[] numbers={1.0,2.2,42.3,55.4,25.5};
        Stream<Double> stream =Stream.of(numbers);
        System.out.println("Sum of the Numbers: "+stream.mapToDouble(Double::doubleValue).sum());
        //System.out.println("Average of the Numbers: "+stream.mapToInt(Integer::intValue).average());
    }

}
