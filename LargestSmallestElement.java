package com.bridgelabz;

public class LargestSmallestElement {
    public static void main(String[] args) {
        System.out.println("Enter size of element:");
        int size=Utility.scannerInt();
        int[] arr=new int[size];
        for (int i = 0; i <size; i++) {
            arr[i]=input();
        }

        largeElement(arr);
        smallestElement(arr);
    }

    private static void smallestElement(int[] a) {
        int small = a[0];
        for (int i = 0; i <a.length; i++) {
            if (small > a[i]){
                small=a[i];
            }
        }
        System.out.println("Smallest element is "+small);
    }

    private static int input() {
        System.out.println("Enter array element:");
       int a=Utility.scannerInt();
        return a;
    }

    private static void largeElement(int[] a) {
        int large = a[0];
        for (int i = 0; i <a.length; i++) {
            if (large<a[i]){
                large=a[i];
            }
        }
        System.out.println("Largest element is "+large);
    }

}