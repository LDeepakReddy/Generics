package com.blz_generics;

public class FindMax {
    public static void main(String[] args) {
        Integer num1 = 10, num2 = 5, num3 = 8;
        int maxInt = num1;
        if (num2.compareTo(maxInt) > 0) {
            maxInt = num2;
        }
        if (num3.compareTo(maxInt) > 0) {
            maxInt = num3;
        }
        System.out.println(maxInt + " is the maximum  number.");
    }
}

