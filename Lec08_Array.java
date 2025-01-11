package com.company;

public class Lec08_Array {
    public static void main(String[] args) {
/*        Classroom of 300 students - You have to store marks of these students
          We have 2 options:
          1. Create 300 variable
          2. Use Array (recommended)
*/

//        There are three main ways to create an array

        int [] marks = new int [5];       //1st method
/*      int[] marks;                        //2nd method
        marks = new int [5];
        marks [0] = 100;
        marks [1] = 90;
        marks [2] = 80;
        marks [3] = 70;
        marks [4] = 96;
*/
        int marks[] = {100,90,80,96,70};      //3rd method

        System.out.println(marks[3]);


    }
}
