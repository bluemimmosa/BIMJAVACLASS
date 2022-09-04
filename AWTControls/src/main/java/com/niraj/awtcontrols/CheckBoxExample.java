/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.awtcontrols;

/**
 *
 * @author Dell
 */
import java.awt.*;
public class CheckBoxExample {
    Frame f;
    Checkbox cb1, cb2, cb3;
    
    public CheckBoxExample(){
        f = new Frame("Title");
        f.setSize(400, 300);
        
        cb1 = new Checkbox("Option1");
        cb2 = new Checkbox("Option2", true);
        cb3 = new Checkbox();
        cb3.setLabel("Option3");
        
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new CheckBoxExample();
    }
    
}
