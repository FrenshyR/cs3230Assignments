package com.github.frenshyr.cs3230.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Utilities {
    public static void main(String[] args) {
        MainMenu.frame.setContentPane(new MainMenu().rootPanel);
        MainMenu.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenu.frame.pack();
        MainMenu.frame.setVisible(true);
    }

}
