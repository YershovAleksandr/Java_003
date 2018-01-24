package com.nam;

public class Main {

    public static void main(String[] args) throws java.io.IOException{
	// write your code here
        System.out.println("Hello World Motherfucka");

        int nums[] = {4, 8, 15, 16, 32, 64, 128, 256, 516, 1024, 2048, 4096, 8105, 16325};

        int sum = 0;

        int k = 0;

        for(int x: nums){
            sum += x;
            System.out.println(k++ + " x = " + x);
        }

        System.out.println("\nSum = " + sum);
    }
}
