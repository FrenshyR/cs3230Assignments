import java.util.ArrayList;
import java.util.Collections;

public class A01{
    public static void main(String[] args) {;
        ArrayList<Integer> results = new ArrayList<Integer>();
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();

        int sumTotal = 0;

        //Get numbers and convert into integers
        for(int i=0; i<args.length; i++){
            //Get numbers and convert into integers
            results.add(Integer.parseInt(args[i]));
        }
        //Remove the first number in the arraylist
        results.remove(0);
        //Sum total of numbers 
        for(int i=0; i<results.size(); i++){
            sumTotal += results.get(i);
            //Get even numbers
            if(results.get(i) % 2 == 0){
                evens.add(results.get(i));
            }
            //Get odd numbers
            else{
                odds.add(results.get(i));
            }  
        }
        Collections.sort(results);
        //Print out results
        System.out.println("Sum: " + sumTotal); 
        System.out.println("Evens: " + evens.toString());
        System.out.println("Odds: " + odds.toString());
        //Print max value
        System.out.println("Max: " + results.get(results.size() - 1));
        //Print min value
        System.out.println("Min: " + results.get(0));   
    }
}