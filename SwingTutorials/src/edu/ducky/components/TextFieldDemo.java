/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class TextFieldDemo extends JFrame implements ActionListener{
    private JTextField tfName;
    private JButton bhit;
    public TextFieldDemo() {
     setSize(200, 150); // Tạo JFrame
        setVisible(true); // Hiển thị JFrame
        setLocation(500, 300); // Vị trí JFrame hiển thị
        setResizable(false); // Tắt tùy chỉnh size JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Tắt chương trình khi đóng JFrame
        
        tfName = new JTextField();
        add(tfName,"North", 0);
        
        bhit = new JButton("Hit me");
        add(bhit, "South", 0);
        bhit.addActionListener(this);
    }  
    public static void main(String[] args) {
        TextFieldDemo textfield = new TextFieldDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if((JButton)e.getSource() == bhit) {
//        JOptionPane.showMessageDialog(null,tfName.getText());
          tfName.setText("Study and Share");
        }
    }
}
