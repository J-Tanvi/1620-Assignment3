/*
---------------------------------------------------------------------------------
Name: Tanvi Jain
Student #: 220287975
Subject: ITEC 1620 - Object-Based Programming
Date: November 26th, 2023

Purpose: to allow the user to input a queen in each row of the chessboard.
----------------------------------------------------------------------------------
 */
//library
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //creates variable to store queen's temporary placement
        int queen;

        //creates empty 2D array/chessboard
        char[][] chessB = {  {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'}};

        //asks user for an input for each row
        for(int i = 0; i < 10; i++){
            System.out.println("Please enter columns to put queen: ");
            queen = scan.nextInt();
            //ensures input is positive and in bounds for the array
            while(queen < 0 || queen > 9){
                System.out.println("Out of Bounds. Please enter another column: ");
                queen = scan.nextInt();
            }
            //changes array at given index to be a queen
            chessB[i][queen] = 'Q';
        }

        //prints the new array
        int row = 10;
        int col = 10;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" " + chessB[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
