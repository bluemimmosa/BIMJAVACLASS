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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
public class ChoiceControl implements ActionListener{
    Frame f;
    Choice c;
    Button b;
    
    ChoiceControl(){
        f = new Frame("Choice");
        f.setSize(400, 300);
        
        b = new Button("Click");
        b.setBounds(50, 200, 60, 30);
        b.addActionListener(this);
        
        c = new Choice();
        c.setBounds(50, 50, 100, 250);
        c.add("Niraj");
        c.add("Laxman");
        c.add("Ayush");
        c.add("Ashutosh");
        c.add("Abhisekh");
        c.add("lokesh");
        
        
        f.add(c);
        f.add(b);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ChoiceControl();
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("The selected item is: "+c.getSelectedItem());
    }

}
