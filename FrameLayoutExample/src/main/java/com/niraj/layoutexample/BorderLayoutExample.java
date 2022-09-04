/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.layoutexample;

import java.awt.*;

public class BorderLayoutExample{
    Frame f;
    Button b1, b2, b3, b4, b5;
    
    public BorderLayoutExample(){
        f = new Frame("Border Layout");
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        
        f.setLayout(new BorderLayout(10,5));
        
        f.add(b1,BorderLayout.NORTH);
//        f.add(b2,BorderLayout.SOUTH);
//        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);
        
        f.setSize(600,400);
        
        f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
    
}