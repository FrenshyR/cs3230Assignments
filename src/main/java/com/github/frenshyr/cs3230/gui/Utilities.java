package com.github.frenshyr.cs3230.gui;

import com.github.frenshyr.cs3230.cli.NumberOperations;
import com.github.frenshyr.cs3230.cli.StringOperations;

import javax.swing.*;

public class Utilities {
    public static boolean validInts = true;

    public static int[] stringToIntArray(String str) {
        String[] input = str.split("\\s+");
        int[] inputInts = new int[input.length];
        for(int i=0; i<input.length; i++){
            try{
                inputInts[i] = Integer.parseInt(input[i]);
            }
            //If users inputs anything besides an integer
            catch(NumberFormatException ex) {
                validInts = false;
            }
        }
        return inputInts;
    }
    public static String fns(int[] userInput) {
        String fns = "Five number summary: \n";
        fns += "Min: " + NumberOperations.min(userInput) + "    ";
        fns += "Max: " + NumberOperations.max(userInput) + "\n";
        fns += "Median: " + NumberOperations.median(userInput) + "\n";
        fns += "Q1: " + NumberOperations.q1(userInput) + "    ";
        fns += "Q3: " + NumberOperations.q3(userInput);
        return fns;
    }
    static String checkListOfStrings(String[] input) {
        //check every word in array
        String str = "Words: " + StringGui.words + "\n";
        for (int i = 0; i < input.length; i++) {
            //Check for palindrome
            if(StringOperations.isPalindrome(input[i])) {
                str += input[i] + ": is a palindrome\n";
            }
            else {
                str += input[i] + ": is NOT a palindrome\n";
            }
        }
        return str;
    }
    //Starts Gui
    public static void startGui(){
        MainGui.frame.setContentPane(new MainGui().rootPanel);
        MainGui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainGui.frame.pack();
        MainGui.frame.setVisible(true);
    }
    //Decimal trimmer
    public static double change(double value, int decimalPoint)
    {
        value = value * Math.pow(10, decimalPoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalPoint);
        return value;
    }
}
