package com.bridgelabz;

public class FrequencyElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,4,2,2,1,9};
        int[] frequencies=new int[arr.length];
        findFrequencyElement(arr,frequencies);
    }

    public static void findFrequencyElement(int[] arr,int[] frequencies) {
        for (int i = 0; i <arr.length; i++) {
            int count=1; 
            if (frequencies[i]==-1){
                continue;
            }
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                    frequencies[j]=-1;
                }
            }
            System.out.println("Element: "+arr[i]+" "+"Count:"+count);
        }
    }
}
