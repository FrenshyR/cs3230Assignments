package com.github.frenshyr.cs3230.gui;
import com.github.frenshyr.cs3230.NumberOperations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MathGui {
    public JPanel mathPanel;
    private JButton sumButton;
    private JButton evensButton;
    private JButton oddsButton;
    private JButton maxButton;
    private JButton minButton;
    private JButton meanButton;
    private JButton standardDeviationButton;
    private JButton a5NumberSummaryButton;
    private JButton returnToMainMenuButton;
    private JPanel heading;
    private JPanel body;
    private JTextField textFieldInts;
    private JButton submitIntsButton;
    private JLabel messageLabel;
    private JTextArea outputText;
    private int[] ints;

    public MathGui() {
        submitIntsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  messageToDisplay = "";
                ints = stringToIntArray();
                messageToDisplay = Arrays.toString(ints);
                outputText.setText(messageToDisplay);
            }
        });
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  output = "";
                output = "Integers: " + Arrays.toString(ints) + "\n";
                output += "Sum: " + NumberOperations.sum(ints);
                textFieldInts.setText("");
                outputText.setText(output);
            }
        });
        evensButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  output = "";
                output = "Integers: " + Arrays.toString(ints) + "\n";
                output += "Evens: " + NumberOperations.evens(ints);
                textFieldInts.setText("");
                outputText.setText(output);
            }
        });
        oddsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  output = "";
                output = "Integers: " + Arrays.toString(ints) + "\n";
                output += "Odds: " + NumberOperations.odds(ints);
                textFieldInts.setText("");
                outputText.setText(output);
            }
        });
        maxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  output = "";
                output = "Integers: " + Arrays.toString(ints) + "\n";
                output += "Max: " + NumberOperations.max(ints);
                textFieldInts.setText("");
                outputText.setText(output);
            }
        });
        minButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  output = "";
                output = "Integers: " + Arrays.toString(ints) + "\n";
                output += "Min: " + NumberOperations.min(ints);
                textFieldInts.setText("");
                outputText.setText(output);
            }
        });
        meanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  output = "";
                output = "Integers: " + Arrays.toString(ints) + "\n";
                output += "Mean: " + NumberOperations.mean(ints);
                textFieldInts.setText("");
                outputText.setText(output);
            }
        });
        standardDeviationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  output = "";
                output = "Integers: " + Arrays.toString(ints) + "\n";
                output += "Standard Deviation: " + NumberOperations.std(ints);
                textFieldInts.setText("");
                outputText.setText(output);
            }
        });
        a5NumberSummaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  output = "";
                output = "Integers: " + Arrays.toString(ints) + "\n";
                output += fns(ints);
                textFieldInts.setText("");
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
    private int[] stringToIntArray() {
        String[] input = textFieldInts.getText().split("\\s+");
        int[] inputInts = new int[input.length];
        for(int i=0; i<input.length; i++){
            try{
                inputInts[i] = Integer.parseInt(input[i]);
            }
            //If users inputs anything besides an integer
            catch(NumberFormatException ex){
                textFieldInts.setText("");
                messageLabel.setText("Invalid integer, try again");
            }
        }
        return inputInts;
    }
    private static String fns(int[] userInput){
        String fns = "Five number summary: \n";
        fns += "Min: " + NumberOperations.min(userInput) + "    ";
        fns += "Max: " + NumberOperations.max(userInput) + "\n";
        fns += "Median: " + NumberOperations.median(userInput) + "\n";
        fns += "Q1: " + NumberOperations.q1(userInput) + "    ";
        fns += "Q3: " + NumberOperations.q3(userInput);
        return fns;
    }}

