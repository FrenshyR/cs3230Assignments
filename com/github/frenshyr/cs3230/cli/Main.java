package com.github.frenshyr.cs3230.cli;
import java.util.Scanner;

public class Main {
    private static String getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println(">");
        return in.nextLine();
    }
    private static int[] update(){
        //Prompt user
        System.out.println("Enter a list of integers(space separated): ");
        //Store numbers
        int[] ints = stringArrayToIntArray(getUserInput().split("\\s+"));
        return ints;
    }
    private static boolean exit(){
        System.out.println("Good Bye!");
        return false;
    }
    private static int[] stringArrayToIntArray(String[] inputedString){
        int[] inputedInts = new int[inputedString.length];
        for(int i=0; i<inputedString.length; i++){
            try{
                inputedInts[i] = Integer.parseInt(inputedString[i]);
            }
            //If users inputs anything besides an integer
            catch(NumberFormatException ex){
                System.out.println(inputedString[i] + " is not a valid intenger, try again");
            }
        }
        return inputedInts;
    }
    private static void startCli(){
        boolean runProgram = true;
        //Prompt and store integers
        int[] ints = update();
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
            switch(option) {
                //Sum of all numbers
                case 1:
                    System.out.println("Sum: " + NumberOperations.sum(ints));
                    break;
                //Get all even numbers
                case 2:
                    System.out.println("Evens: " + NumberOperations.evens(ints));
                    break;
                //Get all odd numbers
                case 3:
                    System.out.println("Odds: " + NumberOperations.odds(ints));
                    break;
                //Get max num
                case 4:
                    System.out.println("Max: " + NumberOperations.max(ints));
                    break;
                //Get min num
                case 5:
                    System.out.println("Min: " + NumberOperations.min(ints));
                    break;
                //Update numbers
                case 6:
                    ints = update();
                    break;
                //Exit program
                case 7:
                    runProgram = exit();
                    in.close();
                    break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to My CS3230 Project!");
        startCli();
    }
}
