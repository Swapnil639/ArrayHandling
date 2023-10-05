package com.bridgelabz;

public class DuplicateElement {
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        int size = Utility.scannerInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input();
        }
        duplicateElement(arr);
    }

    private static void duplicateElement(int[] arr) {
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static int input() {
        System.out.println("Enter array element");
        int a=Utility.scannerInt();
        return a;
    }
}
