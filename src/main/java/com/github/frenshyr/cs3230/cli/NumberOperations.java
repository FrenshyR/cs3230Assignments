package com.github.frenshyr.cs3230;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberOperations {

    static double change(double value, int decimalPoint) {
        value = value * Math.pow(10, decimalPoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalPoint);
        return value;
    }
    public static Integer sum(int[] userInput) {
        int sumTotal = 0;
        //Add all numbers from array into sumTotal
        for (int i=0; i<userInput.length; i++) {
            sumTotal += userInput[i];
        }
        return sumTotal;
    }
    public static ArrayList<Integer> evens(int[] userInput) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        //Find every even number
        for(int i=0; i<userInput.length; i++) {
            if(userInput[i] % 2 == 0){
                evens.add(userInput[i]);
            }
        }
        Collections.sort(evens);
        return evens;
    }
    public static ArrayList<Integer> odds(int[] userInput) {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        //Find every odd number
        for(int i=0; i<userInput.length; i++){
            if(userInput[i] % 2 != 0){
                odds.add(userInput[i]);
            }
        }
        Collections.sort(odds);
        return odds;
    }
    public static Integer max(int[] userInput){
        Arrays.sort(userInput);
        //Return number with max value
        return userInput[userInput.length-1];
    }
    public static Integer min(int[] userInput){
        Arrays.sort(userInput);
        //Return number with the min value
        return userInput[0];
    }
    public static double mean(int[] userInput){
        //Number of elements in array
        double count = userInput.length;
        double sum = (double)sum(userInput);
        return change(sum/count, 4);
    }
    public static double std(int[] userInput){
        double sum = 0;
        double sumDivide = 0;
        //Standard deviation equation
        for (int i = 0; i < userInput.length; i++) {
            sum += Math.pow(((double)userInput[i] - mean(userInput)), 2);
        }
        sumDivide = sum / (double)userInput.length;
        return change(Math.sqrt(sumDivide), 4);
    }
    public static double median(int[] userInput) {
        double median = 0;
        Arrays.sort(userInput);
        //Execute if number of elements are even
        if (userInput.length % 2 == 0){
            //Numbers in middle of list
            int numAtMid1 = 0;
            int numAtMid2 = 0;
            int midpoint = (userInput.length / 2) - 1;
            for(int i=0; i<userInput.length; i++) {
                if(i == midpoint){
                    numAtMid1 = userInput[i];
                }
                if(i == midpoint + 1){
                    numAtMid2 = userInput[i];
                }
            }
            //median equation
            median = ((double)numAtMid1 + (double)numAtMid2)/2;
        }
        //Execute if number of elements are even
        else{
            for(int i=0; i<userInput.length; i++) {
                if((userInput.length / 2) == i) {
                    median = userInput[i];
                }
            }
        }
        return median;
    }
    public static double q1(int[] userInput){
        Arrays.sort(userInput);
        int midpoint = (userInput.length / 2);
        //Grab first half of numbers
        int[] q1Arr = Arrays.copyOfRange(userInput, 0,midpoint);
        return median(q1Arr);
    }
    public static double q3(int[] userInput){
        Arrays.sort(userInput);
        //Execute if number of elements are even
        if (userInput.length % 2 == 0) {
            int start = (userInput.length / 2);
            //Grab numbers in second half
            int[] q3Arr = Arrays.copyOfRange(userInput, start, userInput.length);
            return median(q3Arr);
        }
        else{
            //execute if number of elements are odd
            int start = (userInput.length / 2) + 1;
            //Grab numbers in second half
            int[] q3Arr = Arrays.copyOfRange(userInput, start, userInput.length);
            return median(q3Arr);
        }
    }
    public static void fiveNumSummary(int[] userInput){
        System.out.println("Five number summary:");
        System.out.println("Min: " + min(userInput));
        System.out.println("Max: " + max(userInput));
        System.out.println("Median: " + median(userInput));
        System.out.println("Q1: " + q1(userInput));
        System.out.println("Q3: " + q3(userInput));
    }
}
