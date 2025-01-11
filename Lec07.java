package com.company;
import java.util.Scanner;
public class Lec07 {
    public static void main(String[] args) {

//        String name = new String("Harry");
//        can also be written as
//        String name = "Harry";
//        int a = 10;
//        float b = 29.393f;

// various ways to take output

//        System.out.println(name);
//        System.out.printf("The name is:%s",name);
//        System.out.format("The value of a and b is:%d %8.2f",a,b);

// Taking input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");

        // .next(); Takes only one word
//        String str = sc.next();
        // Takes everything
        String str = sc.nextLine();

        System.out.println(str);

    }
}

