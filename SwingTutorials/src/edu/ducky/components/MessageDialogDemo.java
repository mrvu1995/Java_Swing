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
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MessageDialogDemo extends JFrame{
    public MessageDialogDemo() {
        setSize(200, 150); // Tạo JFrame
        setVisible(true); // Hiển thị JFrame
        setLocation(500, 300); // Vị trí JFrame hiển thị
        setResizable(false); // Tắt tùy chỉnh size JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Tắt chương trình khi đóng JFrame
        JLabel label = new JLabel("Hello World"); // Tạo label
        add(label); // Thêm label vào JFrame
        JButton button1 = new JButton("Hit me !");
        add(button1, "North", 1);
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = "Ducky";
                JOptionPane.showMessageDialog(null, "Name: " + name, "Title", JOptionPane.QUESTION_MESSAGE);
            }
            
        });
    }
    
    public static void main(String[] args) {
        MessageDialogDemo messagedialog = new MessageDialogDemo();
    }
}
