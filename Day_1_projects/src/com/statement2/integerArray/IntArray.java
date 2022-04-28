package com.statement2.integerArray;

public class IntArray {
	

    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};  
        int sum = 0;  
        double avr = 0;
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
           avr=sum/arr.length;
        }
        System.out.println("Sum of all the elements of an array: " + sum);  
        System.out.println("Average of all the elements of an array: " + avr ); 
    }  

	

}
