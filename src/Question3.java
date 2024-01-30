/*
-------------------------------------------------------------------------------------------
Name: Tanvi Jain
Student #: 220287975
Subject: ITEC 1620 - Object-Based Programming
Date: November 27th, 2023

Purpose: to collect inputs from user and performs various fuctions such as;
            - printing the array            - finding the max and min
            - swapping the max/min          - sorting the array in increasing order
            - finding the median
-------------------------------------------------------------------------------------------
 */
//libraries
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //creates an empty array
        System.out.println("The array length is: 8\n");
        int[] nums = new int[8];
        //asks user for values and ensures the input is positive
        for (int i = 0; i < nums.length; i++){
            System.out.println("Please enter the value for the array: ");
            nums[i] = scan.nextInt();
            if(nums[i] < 0){
                System.out.println("Please enter a positive value: ");
                nums[i] = scan.nextInt();
            }
        }

        //prints the array in the order it as inputted
        System.out.println("\nBefore swapping the min max, the array is");
        for (int n : nums){
            System.out.print(n + "  ");
        }

        //finds the max and min and records their indexes
        int max = nums[0];
        int min = nums[0];
        int index = 0;
        int index2 = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if(max < nums [i]) {
                max = nums[i];
                index = i;
            }
            if(min > nums [i]) {
                min = nums[i];
                index2 = i;
            }
        }
        //prints max/min + locations
        System.out.println ("\n\nThe max is " + max + " and its location is " + index);
        System.out.println ("The min is " + min + " and its location is " + index2);

        //swaps the locations for max and min + prints
        nums[index] = min;
        nums[index2] = max;
        System.out.println("\nAfter swapping the min max, the array is");
        for (int n : nums){
            System.out.print(n + "  ");
        }

        //uses a selection sort algorithm to sort the array in ascending order
        for(int left = nums.length; left > 0; left--){
            int max2 = 0; // represents index
            for (int i = 1; i < left; i++) {
                if (nums[max2] < nums[i]) {
                    max2 = i;
                }
            }
            int temp = nums[max2];
            nums[max2] = nums[left - 1];
            nums[left - 1] = temp;
        }
        //prints the sorted array
        System.out.print("\n\nThe array sorted in Ascending Order: ");
        for (int n : nums){
            System.out.print(n + " ");
        }

        //solves for median and prints results
        double med = nums[3] + nums[4];
        med /= 2;
        System.out.println("\n\nThe median is: " + med);
    }
}
