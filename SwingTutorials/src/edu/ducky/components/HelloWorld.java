/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class HelloWorld extends JFrame{
    public HelloWorld() {
        setSize(200, 150);
        setVisible(true);
        setLocation(500, 300);
        setResizable(false);
        JLabel label = new JLabel("Hello World");
        add(label);
    }
    
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
    }
}
