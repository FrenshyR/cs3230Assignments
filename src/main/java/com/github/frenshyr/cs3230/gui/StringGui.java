package com.github.frenshyr.cs3230.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    public static String words = "";

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
                String output = Utilities.checkListOfStrings(input);
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
