/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *  
 * @author Admin
 */
public class LabelDemo extends JFrame{
    public LabelDemo() {
        setSize(200, 150);
        setVisible(true);
        setLocation(500, 300);
        setResizable(false);
        JLabel label = new JLabel("Hello World");
        add(label);
        
        label.setText("Viet Nam");
        label.setToolTipText("A beautiful country");
        label.setForeground(Color.blue);
    }
    
    public static void main(String[] args) {
        LabelDemo labeldemo = new LabelDemo();
    }
}
