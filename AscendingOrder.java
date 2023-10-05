package com.bridgelabz;

public class AscendingOrder {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        int size = Utility.scannerInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input();
        }
        ascendingOrder(arr);
    }

    private static void ascendingOrder(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }

    private static int input() {
        System.out.println("Enter array element:");
        int a=Utility.scannerInt();
        return a;
    }
}
