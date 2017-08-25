/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class ImageDemo extends JFrame{
    public ImageDemo() {
        setSize(500, 300);
        setVisible(true);
        setLocation(500, 300);
        setResizable(false);
        JLabel label = new JLabel("ImageDemo");
        add(label);
        label.setSize(450, 250);
        System.out.println("x: " + label.getSize().width + " y: " + label.getSize().height);   
        setPicture(label,"47.jpg");
} 
    public void setPicture(JLabel label, String filename){
        try {
            BufferedImage image = ImageIO.read(new File("47.jpg"));
            int x = label.getSize().width;
            int y = label.getSize().height;
            int ix = image.getWidth();
            int iy = image.getHeight();
            int dx = 0;
            int dy = 0;
            if(x / y > ix / iy) {
                dy = y;
                dx = dy * ix / iy;
            } else {
                dx = x;
                dy = dx * iy / ix;
            }
            ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, image.SCALE_SMOOTH));
            label.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(ImageDemo.class.getName()).log(Level.SEVERE, null, ex);
        }          
    }
    public static void main(String[] args) {
        ImageDemo imagedemo = new ImageDemo();
    }
}
