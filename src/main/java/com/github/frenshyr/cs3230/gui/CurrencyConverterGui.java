package com.github.frenshyr.cs3230.gui;

import com.github.frenshyr.cs3230.models.CurrencyConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterGui {
    public JPanel currencyConverterPanel;
    private JButton convertButton;
    private JComboBox currencyComboBox1;
    private JButton returnToMainMenuButton;
    private JComboBox currencyComboBox2;
    private JTextPane outputTextPane;
    private JTextField inputTextField;
    private CurrencyHttpClient client = new CurrencyHttpClient();

    public CurrencyConverterGui() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String code1 = currencyComboBox1.getSelectedItem().toString();
                String code2 = currencyComboBox2.getSelectedItem().toString();
                double amount = Double.parseDouble(inputTextField.getText());
                CurrencyConverter currencyConverter = client.getCurrencyConverted(code1, code2);
                outputTextPane.setText(CurrencyConverter.convertedRate(currencyConverter.getRate(), amount));
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
