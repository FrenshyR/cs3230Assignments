package com.github.frenshyr.cs3230;

public class StringOperations {
    static void checkListOfStrings(String[] userInput){
        //check every word in array
        for (int i=0; i< userInput.length; i++) {
            if(isPalindrome(userInput[i])){
                System.out.println(userInput[i] + ": is a palindrome");
            }
            else {
                System.out.println(userInput[i] + ": is NOT a palindrome");
            }
        }
    }
    public static boolean isPalindrome(String currWord) {
        //Pointers pointing to the start and end character in word
        int i = 0, j = currWord.length() - 1;
        //Check all characters
        while (i < j) {
            //If there is a mismatch
            if (currWord.charAt(i) != currWord.charAt(j))
                return false;
            //Increment pointer
            i++;
            //Decrement pointer
            j--;
        }
        //We have a palindrome
        return true;
    }
}
