package com.sandbox.recursion;

public class Factorial {
    private static int counter = 0;

    public static void main(String[] args) {
        for (int x = 0; x<= 20; x++){
            System.out.println("Factorial(" + x + ") = " + factorial(x) );
        }
    }

    public static long factorial(int x){
        if(x==0){
            return 1;
        }
            counter ++;
            System.out.println("Count" + counter);

            return x * factorial(x-1);

    }
}
