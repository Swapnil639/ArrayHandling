package com.bridgelabz;

public class PrintArrayElement {
    public static void main(String[] args) {
        int[] arr={10,67,29,68,45,34,24,90};
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int a:arr){
            System.out.println(a);
        }
    }
}
