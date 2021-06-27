package com.github.frenshyr.cs3230.cli;

import java.util.Scanner;

public class Cli {
    static void startCli(){
        boolean runProgram = true;
        //Prompt and store integers
        int[] ints = Main.update();
        //Run program until user decides otherwise
        while(runProgram){
            System.out.println("Choose an Operation:");
            System.out.println("1: Sum - sum the integers");
            System.out.println("2: Evens - find the evens");
            System.out.println("3: Odds - find the odds");
            System.out.println("4: Max - find the max");
            System.out.println("5: Min - find the min");
            System.out.println("6: Update - enter a new list of integers");
            System.out.println("7: Exit");
            Scanner in = new Scanner(System.in);
            int option = in.nextInt();
            //If option is outbound prompt user to try again
            if(option >= 8){
                System.out.println("Please enter option from 1-8");
                option = in.nextInt();
            }
            switch (option) {
                //Sum of all numbers
                case 1 -> System.out.println("Sum: " + NumberOperations.sum(ints));

                //Get all even numbers
                case 2 -> System.out.println("Evens: " + NumberOperations.evens(ints));

                //Get all odd numbers
                case 3 -> System.out.println("Odds: " + NumberOperations.odds(ints));

                //Get max num
                case 4 -> System.out.println("Max: " + NumberOperations.max(ints));

                //Get min num
                case 5 -> System.out.println("Min: " + NumberOperations.min(ints));

                //Update numbers
                case 6 -> ints = Main.update();

                //Exit program
                case 7 -> {
                    runProgram = Main.exit();
                    in.close();
                }
            }
        }
    }
}
