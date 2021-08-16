package com.github.frenshyr.cs3230.gui;
import com.github.frenshyr.cs3230.cli.NumberOperations;

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
    public JTextField textFieldInts;
    private JButton submitIntsButton;
    public JLabel messageLabel;
    private JTextArea outputText;
    private int[] ints;

    public MathGui() {
        submitIntsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String  messageToDisplay = "";
                ints = Utilities.stringToIntArray(textFieldInts.getText());

                //Check if input is valid
                if(Utilities.validInts) {
                    messageToDisplay = Arrays.toString(ints);
                    outputText.setText(messageToDisplay);
                }
                else {
                    textFieldInts.setText("");
                    messageLabel.setText("Invalid input, please try again");
                    outputText.setText("");
                    ints = null;
                }
                Utilities.validInts = true;
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
                output += Utilities.fns(ints);
                textFieldInts.setText("");
                outputText.setText(output);
            }
        });
        returnToMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainGui.frame.setContentPane(new MainGui().rootPanel);
                MainGui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                MainGui.frame.setVisible(true);
            }
        });
    }
}

