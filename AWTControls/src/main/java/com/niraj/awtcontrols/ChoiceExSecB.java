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
import java.awt.event.*;
public class ChoiceExSecB implements ActionListener{
    Frame f;
    Choice choice;
    Button btn;
    
    ChoiceExSecB(){
        f = new Frame("Choice Example");
        f.setSize(400, 300);
        btn  = new Button("Click me");
        
        
        choice = new Choice();
        btn.addActionListener(this);
        choice.add("Niraj");
        choice.add("Manoj");
        choice.add("Pukar");
        choice.add("Swostika");
        choice.add("Rachana");
        
        
        f.add(choice);
        f.add(btn);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ChoiceExSecB();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("The selected name is: "+choice.getSelectedItem());
    }
}
