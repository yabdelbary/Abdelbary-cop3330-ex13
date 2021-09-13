package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is the principal amount? ");
        Scanner sc = new Scanner(System.in);
        double principal= Double.parseDouble(sc.nextLine());
        System.out.println("What is the rate? ");
        double rate = Double.parseDouble(sc.nextLine());
        System.out.println("What is the number of years? ");
        int years = Integer.parseInt(sc.nextLine());
        System.out.println("What is the number of times the interest is compounded per year? ");
        double compounded_per_year = Double.parseDouble(sc.nextLine());
        double rate_2 = rate/100;
        double amount = (principal*Math.pow(1 + ((rate_2)/compounded_per_year),(compounded_per_year * years))*100)/100;
        System.out.printf("%.0f invested at %.1f%% for %d years compounded %.0f times per year is $%.2f.",principal, rate, years, compounded_per_year, amount);
    }
}
