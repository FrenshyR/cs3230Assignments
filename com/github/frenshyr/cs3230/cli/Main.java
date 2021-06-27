package com.github.frenshyr.cs3230.cli;
import java.util.Scanner;

public class Main {
    private static String getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println(">");
        return in.nextLine();
    }
    static int[] update(){
        //Prompt user
        System.out.println("Enter a list of integers(space separated): ");
        //Store numbers
        return stringArrayToIntArray(getUserInput().split("\\s+"));
    }
    static boolean exit(){
        System.out.println("Good Bye!");
        return false;
    }
    private static int[] stringArrayToIntArray(String[] inputString){
        int[] inputInts = new int[inputString.length];
        for(int i=0; i<inputString.length; i++){
            try{
                inputInts[i] = Integer.parseInt(inputString[i]);
            }
            //If users inputs anything besides an integer
            catch(NumberFormatException ex){
                System.out.println(inputString[i] + " is not a valid integer, try again");
            }
        }
        return inputInts;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to My CS3230 Project!");
        Cli.startCli();
    }
}
