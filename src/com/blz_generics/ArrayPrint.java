package com.blz_generics;

public class ArrayPrint<T> {

    public static <T> void toPrint(T[] array) {
        for (T value : array) {
            System.out.println(value + " ");
        }
    }

    public static void main(String[] args) {
        Integer array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ArrayPrint.toPrint(array);
        Double doubleArray[] = {1.5, 2.0, 3.6, 4.8, 5.9};
        ArrayPrint.toPrint(doubleArray);


    }
}