/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.layoutexample;

/**
 *
 * @author Niraj Khadka
 */
import java.awt.*;
public class FlowLayoutExample {
    Frame f;
    Button b1, b2, b3, b4;
    
    public FlowLayoutExample(){
        f = new Frame("Flow Layout Example");
        f.setSize(300,200);
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        f.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
