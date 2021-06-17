package com.github.frenshyr.cs3230.cli;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberOperations {
    static Integer sum(int[] userInput){
        int sumTotal = 0;
        //Add all numbers from array into sumTotal
        for (int i=0; i<userInput.length; i++){
            sumTotal += userInput[i];
        }
        return sumTotal;
    }
    static ArrayList<Integer> evens(int[] userInput){
        ArrayList<Integer> evens = new ArrayList<Integer>();
        //Find every even number
        for(int i=0; i<userInput.length; i++){
            if(userInput[i] % 2 == 0){
                evens.add(userInput[i]);
            }
        }
        Collections.sort(evens);
        return evens;
    }
    static ArrayList<Integer> odds(int[] userInput){
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
    static int max(int[] userInput){
        Arrays.sort(userInput);
        //Return number with max value
        return userInput[userInput.length-1];
    }
    static int min(int[] userInput){
        Arrays.sort(userInput);
        //Return number with the min value
        return userInput[0];
    }
}
