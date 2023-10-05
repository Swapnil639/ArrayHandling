package com.bridgelabz;

public class EvenAndOddPosition {
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        int size = Utility.scannerInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input();
        }
        evenPosition(arr);
        oddPosition(arr);
    }

    private static void oddPosition(int[] arr) {
        System.out.println("Elements at odd positions:");
        for (int i = 0; i <arr.length; i++) {
            if (i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }

    private static void evenPosition(int[] arr) {
        System.out.println("Elements at Even positions:");
        for (int i = 0; i <arr.length; i++) {
            if (i%2==0){
                System.out.println(arr[i]);
            }
        }
    }

    private static int input() {
        System.out.println("Enter array element");
            int a=Utility.scannerInt();
            return a;
        }
}
