package com.bridgelabz;


public class InsertElement {
        public static void insertElement(int[] array, int element, int position) {
            int[] newArray = new int[array.length + 1];

            for (int i = 0; i < newArray.length; i++) {
                if (i < position) {
                    newArray[i] = array[i];
                } else if (i == position) {
                    newArray[i] = element;
                } else {
                    newArray[i] = array[i - 1];
                }
            }
            System.out.println("Array after insertion:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i]+",");
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int position = 2;
            int element = 10;
            System.out.println("Original array:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+",");
            }
            System.out.println();
            insertElement(array,element,position);
        }

}
