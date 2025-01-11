package com.company;

public class Lec08_ArrMethod {
    public static void main(String[] args) {
        int [] marks = {90,98,78,47,37};
        float []marks1 = {90,98.5f,78,47.5f,37};
        String []student = {"Sat","yam","harry","babbar"};
        // System.out.println(marks.length);
        // System.out.println(student.length);

        // displaying the array - conventional method
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

          System.out.println("displaying using for loop - Method 1");
//        for (int i = 0; i < marks1.length; i++) {
//            System.out.println(marks1[i]);
//        }

         System.out.println("displaying in reverse order");
         for (int i = marks1.length - 1; i>= 0 ; i--){
            System.out.println(marks1[i]);
        }

        // Method 2
        for (float element: marks1){
            System.out.println(element);
        }

    }
}
