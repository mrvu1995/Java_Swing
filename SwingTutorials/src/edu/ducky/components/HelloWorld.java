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
        setSize(200, 150); // Tạo JFrame
        setVisible(true); // Hiển thị JFrame
        setLocation(500, 300); // Vị trí JFrame hiển thị
        setResizable(false); // Tắt tùy chỉnh size JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Tắt chương trình khi đóng JFrame
        JLabel label = new JLabel("Hello World"); // Tạo label
        add(label); // Thêm label vào JFrame
    }
    
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
    }
}
