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

public class LablesNButtons implements ActionListener {
    Frame f;
    Label l1, l2;
    Button b1, b2;
    
    public LablesNButtons(){
        f = new Frame("Labels and Buttons");
        f.setSize(400, 300);
        
        
        l1 = new Label();
        l1.setText("Name: ");
        
        l2 = new Label("Password: ");
        
        b1 = new Button();
        b1.setLabel("Button 1");
        b1.addActionListener(this);
        
        b2 = new Button("Button 2");
        
        f.add(l1);
        f.add(b1);
        f.add(l2);
        f.add(b2);
        
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
    }
    
    public static void main(String[] args){
        new LablesNButtons();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("The text in l1 is: "+l1.getText());
        System.out.println("The label in Button 2 is: "+b2.getLabel());
    }
    
}
