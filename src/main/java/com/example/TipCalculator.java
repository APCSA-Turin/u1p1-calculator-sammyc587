package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        double tip = cost * ((double)percent/100);
        // I learned how to round using Math.round from https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java 
        double tip2 = (double) Math.round(tip * 100) / 100;
        double total = tip2 + cost;
        double average = cost/(double)people;
        double average2 = (double) Math.round(average * 100) /100;
        double averageTip = tip2/(double)people;
        double averageTip2 = (double) Math.round(averageTip * 100) / 100;
        double averageCost = total/(double)people;
        double averageCost2 = (double) Math.round(averageCost * 100) / 100;
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip2 + "\n" +
                       "Total Bill with tip: $" + total + "\n" +
                       "Per person cost before tip: $" + average2 + "\n" +
                       "Tip per person: $" + averageTip2 + "\n" +
                       "Total cost per person: $" + averageCost2 + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (condition) {
            //enter your code here 
            System.out.println("placeholder");
            condition = false;
    
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        