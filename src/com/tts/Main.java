package com.tts;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

//    1) Ask user for 5 numbers to be in your array list
//  Intro
        System.out.println("Let's create an array! You will be asked to enter five numbers.");
//  Setup
        Scanner question = new Scanner(System.in);

        ArrayList<Integer> newArr = new ArrayList<Integer>();
// Questions
        System.out.println("Please enter your first number:");
        int numOne = question.nextInt();
        newArr.add(numOne);

        System.out.println("Please enter your second number:");
        int numTwo = question.nextInt();
        newArr.add(numTwo);

        System.out.println("Please enter your third number:");
        int numThree = question.nextInt();
        newArr.add(numThree);

        System.out.println("Please enter your fourth number:");
        int numFour = question.nextInt();
        newArr.add(numFour);

        System.out.println("Please enter your fifth number:");
        int numFive = question.nextInt();
        newArr.add(numFive);

// Completed Array we're working with:
        System.out.println("Great. Your array now looks like this: \n" + newArr);

//  Find the sum of the elements in the array list
        int sum = 0;
        for (int value : newArr) {
            sum += value;
        }
        System.out.println("\n The sum of the array is: \n" + sum);


//    Find the product of elements in array list
        int product = 1;
        for (int value : newArr) {
            product *= value;
        }
        System.out.println("\n The product of this array is: \n" + product);


//    Find the minimum of the elements in the array list
        int min = Collections.min(newArr);
        for (int num : newArr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("\n The smallest number in your array is: " + min);

        //    Find the max of the elements in the array list
        int max = Collections.max(newArr);
        for (int numMax : newArr) {
            if (numMax > max) {
                max = numMax;
            }
        }
        System.out.println("\n The largest number in your array is: " + max);

// Goodbye, now!
        System.out.println("\nThank you for your participation. Goodbye!");
    }
}


