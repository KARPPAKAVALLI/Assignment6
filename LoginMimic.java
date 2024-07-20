package com.assignment6;

public class LoginMimic {
    //1. Write a java program to mimic login of a person (Get username and password from the user and authenticate).
    // The username and password should be hardcoded in a static block.
    static String userName;
    static String password;

    static {
        userName="Valli";
        password="xyz@123";
    }

    public static void main(String[] args) {
        if(userName.equals("Valli") && password.equals("xyz@123"))
            System.out.println("Authentication Valid");
        else
            System.out.println("Authentication Invalid");
    }
}
