package com.blz_generics;

public class ArrayPrint {
    Integer intArray[];
    Double doubleArray[];
    Character charArray[];

    ArrayPrint(Integer[] intArray) {
        this.intArray = intArray;
    }

    ArrayPrint(Double[] doubleArray) {
        this.doubleArray = doubleArray;
    }

    ArrayPrint(Character[] charArray) {
        this.charArray = charArray;
    }

    public void toPrint(Integer[] intArray) {
        for (Integer value : intArray) {
            System.out.println(value + " ");
        }
    }

    public void toPrint(Double[] doubleArray) {
        for (Double value : doubleArray) {
            System.out.println(value + " ");
        }
    }

    public void toPrint(Character[] charArray) {
        for (Character value : charArray) {
            System.out.println(value + " ");
        }
    }

    public static void main(String[] args) {
        Integer intArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ArrayPrint printIntArray = new ArrayPrint(intArray);
        printIntArray.toPrint(printIntArray.intArray);

        Double doubleArray[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        ArrayPrint printDoubleArray = new ArrayPrint(doubleArray);
        printDoubleArray.toPrint(printDoubleArray.doubleArray);

        Character charArray[] = {'a', 'b', 'c', 'd'};
        ArrayPrint printCharArray = new ArrayPrint((charArray));
        printCharArray.toPrint(printCharArray.charArray);


    }
}
