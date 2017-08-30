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
public class ConfirmDialogDemo extends JFrame{
    public ConfirmDialogDemo() {
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
//               int click = JOptionPane.showConfirmDialog(null, "Is Ducky");
//               if(click == JOptionPane.YES_OPTION) {
//                   JOptionPane.showMessageDialog(null, "Click Yes");
//               }
//               if(click == JOptionPane.NO_OPTION) {
//                   JOptionPane.showMessageDialog(null, "Click No");
//               }
//               if(click == JOptionPane.CANCEL_OPTION) {
//                   JOptionPane.showMessageDialog(null, "click cancel");
//               }
                 int click2 = JOptionPane.showConfirmDialog(null,"Is Ducky", "Question", JOptionPane.YES_NO_OPTION);
            }
            
        });
    }
    
    public static void main(String[] args) {
        ConfirmDialogDemo confirmdialog = new ConfirmDialogDemo();
    }
}
