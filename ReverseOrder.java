package com.bridgelabz;

public class ReverseOrder {
    public static void main(String[] args) {
        System.out.println("enter size of array:");
        int size = Utility.scannerInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input();
        }
        reverseOrder(arr);
    }

    private static void reverseOrder(int[] arr) {
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }

    private static int input() {
        System.out.println("Enter array element:");
        int a=Utility.scannerInt();
        return a;
    }
}
