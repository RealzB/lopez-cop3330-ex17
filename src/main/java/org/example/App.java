package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r=0;
        double a=0;
        double w=0;
        double hr=0;
        System.out.println("Enter a 1 if you are male or a 2 if you are female:");
        String uigender = sc.nextLine();
        if (!uigender.matches("[0-999]")) {
            System.out.println("Invalid number. Restart.");
            System.exit(1);
        }
        else if(uigender.matches("1"))
            r = 0.73;
        else if(uigender.matches("2"))
            r = 0.66;
        System.out.println("How many ounces of alcohol did you have?");
        String uialcohol = sc.nextLine();
        float alcohol = Float.valueOf(uialcohol);
        if (!uialcohol.matches("[0-999]")) {
            System.out.println("Invalid number. Restart.");
            System.exit(1);
        }
        else if(uialcohol.matches("[0-999]"))
            a = alcohol;
        System.out.println("What is your weight, in pounds?");
        String uiweight = sc.nextLine();
        float weight = Float.valueOf(uiweight);
        if (!uialcohol.matches("[0-999]")) {
            System.out.println("Invalid number. Restart.");
            System.exit(1);
        }
        else if(uialcohol.matches("[0-999]"))
            w = weight;
        System.out.println("How many hours has it been since your last drink? ");
        String uihours = sc.nextLine();
        float hours = Float.valueOf(uihours);
        if (!uialcohol.matches("[0-999]")) {
            System.out.println("Invalid number. Restart.");
            System.exit(1);
        }
        else if(uialcohol.matches("[0-999]"))
            hr = hours;

        double bac = (a * 5.14 / w * r) - .015 * hr;

        String failed = String.format("Your BAC is %.6f\nIt is not legal for you to drive.", bac);

        String passed = String.format("Your BAC is %.6f\nIt is legal for you to drive.", bac);

        if(bac >= 0.08)
            System.out.println(failed);
        else if(bac < 0.08)
            System.out.println(passed);




    }
}