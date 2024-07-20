package com.assignment6;

public class MathOperations {
    //2. Write a program to calculate Math operations with Math contents initialized in static block.
    static int num1,num2;
    static {
        num1=10;
        num2=30;
    }

    public static void main(String[] args) {
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num2-num1));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println("Remainder: "+(num1%num2));
    }
}
