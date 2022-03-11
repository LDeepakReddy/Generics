package com.blz_generics;

public class FindMax {
    public static void main(String[] args) {
        Integer num1 = 100, num2 = 5, num3 = 8;
        Float float1 = 95.4f, float2 = 50.5f, float3 = 80.7f;
        //String string1 = "car", string2 = "Aeroplane", string3 = "Bike";
        int maxInt = num1;
        if (num2.compareTo(maxInt) > 0) {
            maxInt = num2;
        }
        if (num3.compareTo(maxInt) > 0) {
            maxInt = num3;
        }
        System.out.println(maxInt + " is the maximum number.");

        float maxFloat = float1;
        if (float2.compareTo(maxFloat) > 0) {
            maxFloat = float2;
        }
        if (float3.compareTo(maxFloat) > 0) {
            maxFloat = float3;
        }
        System.out.println(maxFloat + " is the maximum float.");
    }
}

