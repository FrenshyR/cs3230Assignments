package com.github.frenshyr.cs3230.gui;
import com.github.frenshyr.cs3230.StringOperations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class StringGui {
    public JPanel stringPanel;
    private JPanel heading;
    private JButton palindromeButton;
    private JButton returnToMainMenuButton;
    private JPanel body;
    private JTextField inputText;
    private JButton submitWordsButton;
    private JLabel messageLabel;
    private JTextArea outputText;
    private String[] input;
    private  static String words = "";

    public StringGui() {
        submitWordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input = inputText.getText().split("\\s+");
                for(int i = 0; i < input.length; i++){
                    words += input[i] + " ";
                }
                outputText.setText(words);
            }
        });
        palindromeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String output = checkListOfStrings(input);
                outputText.setText(output);
            }
        });
        returnToMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainMenu.frame.setContentPane(new MainMenu().rootPanel);
                MainMenu.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.pack();
                MainMenu.frame.setVisible(true);
            }
        });
    }
    static String checkListOfStrings(String[] input){
        //check every word in array
        String str = "Words: " + words + "\n";
        for (int i = 0; i < input.length; i++) {
            //Check for palindrome
            if(StringOperations.isPalindrome(input[i])){
                str += input[i] + ": is a palindrome\n";
            }
            else {
                str += input[i] + ": is NOT a palindrome\n";
            }
        }
        return str;
    }
}
