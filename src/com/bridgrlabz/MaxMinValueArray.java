package com.bridgrlabz;

public class MaxMinValueArray {
    public static void sort(int arr[],int n){
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        print(arr);
    }
    public static void print(int[] arr){
        for (int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                System.out.print(arr[i]+", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array ={32,192,10,30,20,40,60,50,70,90,80};
        int n= array.length;
        sort(array, n );
        //System.out.println(arr);
        System.out.println("\nMinimum value present in the Array is: "+array[0]);
        System.out.println("Maximum value present in the Array is: "+array[array.length-1]);
    }
}
