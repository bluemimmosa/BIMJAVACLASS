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

public class LabelsAndButtonsSecB implements ActionListener{
    Label l1, l2, l3;
    Button b1, b2;
    Frame f;
    
    public LabelsAndButtonsSecB(){
        f = new Frame("Lables and Buttons Sec B");
        f.setSize(400, 300);
        
        l1 = new Label();
        l1.setBounds(50, 50, 300, 30);
        l1.setText("Label 1");
        l1.setAlignment(Label.LEFT);
        
        l2 = new Label("Label 2");
        l2.setAlignment(Label.RIGHT);
        l2.setBounds(50, 100, 300, 30);
        
        l3 = new Label("Manoj", Label.CENTER);
        l3.setBounds(50, 150, 300, 30);
        
        b1 = new Button();
        b1.setLabel("OK");
        b1.setBounds(50, 200, 100, 30);
        b1.addActionListener(this);
        
        b2 = new Button("Cancel");
        b2.setBounds(200, 200, 100, 30);
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(b1);
        f.add(b2);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        new LabelsAndButtonsSecB();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("The label in l3 is: "+l3.getText());
    }
}
