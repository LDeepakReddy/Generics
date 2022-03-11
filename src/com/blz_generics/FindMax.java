package com.blz_generics;

public class FindMax {

    public static <T extends Comparable<T>> void  compare(T x,T y,T z){
        T max =x;
        if (y.compareTo(max)>0) {
            max = y;
        }
        if (z.compareTo(max)>0){
            max=z;
        }
        System.out.println(max + " is the maximum ");
    }

    public static void main(String[] args) {
        Integer num1 = 100, num2 = 5, num3 = 8;
        FindMax.compare(num1,num2,num3);
        Float float1 = 95.4f, float2 = 50.5f, float3 = 80.7f;
        FindMax.compare(float1,float2,float3);
        String string1 = "car", string2 = "Aeroplane", string3 = "Bike";
        FindMax.compare(string1,string2,string3);

//
//        if (string1.length() > string2.length() && string1.length() > string3.length()) {
//
//            System.out.println(string1 + " is the maximum");
//        } else if (string2.length() > string3.length()) {
//            System.out.println(string2 + " is the maximum");
//        } else {
//            System.out.println(string3 + " is the maximum");
//        }
    }
}

