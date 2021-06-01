package com.tom.car;

import javax.swing.*;

public class CarDemo {
    private JPanel mainpanel;
    private JPanel Npanel;
    private JTextField textField1;
    private JButton button1;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainpanel);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Parking lot:");
    }
}
