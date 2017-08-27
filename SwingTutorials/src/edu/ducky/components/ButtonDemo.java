/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class ButtonDemo extends JFrame implements ActionListener{
    private JLabel label;
    private JButton button1;
    public ButtonDemo() {
        setSize(500,300);
        setVisible(true);
        setLocation(500, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("");
        add(label);
        JButton button = new JButton("Block 1");
        add(button, "North", 1);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chaneText();
            }            
        });
        button1 = new JButton("Block 2");
        add(button1, "South", 1);
        button1.addActionListener(this);
   }    
    @Override
    public void actionPerformed(ActionEvent e) {
       JButton b = (JButton) e.getSource();
       if(b == button1) {
           label.setText("MAC Address 18:4f:32:06:db:e7");
       }
    }
    public void chaneText() {
        label.setText("MAC Address 3c:ab:8e:81:2a:b8");
    }
    public static void main(String[] args) {
        ButtonDemo buttonDemo = new ButtonDemo();
    }
    
}
