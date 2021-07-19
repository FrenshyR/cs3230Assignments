package com.github.frenshyr.cs3230;

import javax.swing.*;

public class Gui {
    private JPanel rootPanel;
    private JTextPane mathOperationsTextPane;
    private JButton sumButton;
    private JButton evensButton;
    private JTextArea findAllEvenIntegersTextArea;
    private JTextArea sumAllIntegersTextArea;
    private JButton oddsButton;
    private JTextArea findAllOddIntegersTextArea;
    private JButton maxButton;
    private JTextArea findTheMaxTextArea;
    private JButton minButton;
    private JTextArea findTheMinTextArea;
    private JButton meanButton;
    private JTextArea findTheMeanTextArea;
    private JButton standardDeviationButton;
    private JTextArea findTheStandardDeviationTextArea;
    private JButton a5NumberSummaryButton;
    private JTextArea findMinMaxMediaTextArea;
    private JButton updateButton;
    private JTextArea enterANewListTextArea;
    private JButton returnToMainMenuButton;
    private JPanel heading;
    private JPanel body;
    public static void main(String[] args){
        JFrame frame = new JFrame("CS3230 Project");
        frame.setContentPane(new Gui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

