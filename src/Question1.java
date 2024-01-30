/*
---------------------------------------------------------------------------------
Name: Tanvi Jain
Student #: 220287975
Subject: ITEC 1620 - Object-Based Programming
Date: November 26th, 2023

Purpose: to create 6 customers and perform various tasks with each person.
~~Note- this question has a class named 'Customer' that runs with it~~
----------------------------------------------------------------------------------
 */
//library
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        double balance;
        double average = 0;

        //asks user to create 6 total customers with their names and balance
        Customer[] customers = new Customer[6];
        System.out.println("For 6 customers, enter their name and in the next line, their balance:");
        for(int i = 0; i < customers.length; i++){
            name = scan.next();
            balance = scan.nextDouble();
            customers[i] = new Customer(name, balance);
            //adds balance to the average
            average += balance;
        }

        //finds which customers have a balance under $150 and prints their name
        System.out.println("\nSearching for all customers who have less than $150...");
        for(Customer c: customers) {
            if(c.getBalance() < 150.0) {
                System.out.println(c.getName());
            }
        }

        //finds the customers with the highest and lowest balances
        //records name
        String highest = " ";
        String lowest = " ";
        //tracks current max/min
        double max = customers[0].getBalance();
        double min = customers[0].getBalance();
        for(Customer c : customers){
            if(c.getBalance() > max){
                highest = c.getName();
                max = c.getBalance();
            }
            if(c.getBalance() < min){
                lowest = c.getName();
            }
        }

        //calculates average balance and prints
        average = average/customers.length;
        System.out.println("\nThe average balance is: " + average);
        //prints the highest and lowest balances between the given customers
        System.out.println("\nThe customer with the highest balance is: " + highest);
        System.out.println("\nThe customer with the lowest balance is: " + lowest);

        //adds 15% to each account and prints the new account balances
        System.out.println("\nShow all accounts after a 15% balance increase");
        for(Customer c : customers){
            c.addPercentage(1.15);
            System.out.println(c.getName() + " has \t\t$" + c.getBalance());
        }
    }
}
