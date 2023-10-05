package com.bridgelabz;

public class SecondLargestElement {
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        int size = Utility.scannerInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input();
        }
        System.out.println(findSecondLargest(arr));
    }
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }
        return secondLargest;
    }
    private static int input() {
        System.out.println("Enter array element:");
        int a=Utility.scannerInt();
        return a;
    }
}
