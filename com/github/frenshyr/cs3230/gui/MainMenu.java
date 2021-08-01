package com.github.frenshyr.cs3230.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    public JPanel rootPanel;
    public  JButton mathOperationsButton;
    public  JButton stringOperationsButton;
    public static JFrame frame =new JFrame("CS3230 Project");

    public MainMenu() {
        mathOperationsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.setContentPane(new MathGui().mathPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        stringOperationsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.setContentPane(new StringGui().stringPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

