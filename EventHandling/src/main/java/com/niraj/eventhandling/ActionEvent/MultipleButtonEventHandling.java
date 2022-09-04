/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.eventhandling.ActionEvent;

/**
 *
 * @author Niraj Khadka*/
import java.awt.*;
import java.awt.event.*;
public class MultipleButtonEventHandling extends Frame implements ActionListener{
    Button btn1, btn2, btn3;

    public MultipleButtonEventHandling() {
        btn1 = new Button("Button 1");
        btn1.setBounds(10,50,100,20);
        btn1.addActionListener(this);
        btn1.setActionCommand("niraj");
        
        btn2 = new Button("Button 2");
        btn2.setBounds(120, 50, 100, 20);
        btn2.addActionListener(this);
        btn2.setActionCommand("prasanna");
        
        btn3 = new Button("Button 3");
        btn3.setBounds(230, 50, 100, 20);
        btn3.addActionListener(this);
        btn3.setActionCommand("rayamajhi");
        
        this.setTitle("Multiple Button Example");
        this.setSize(600, 200);
        
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        
        this.setLayout(null);
        this.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new MultipleButtonEventHandling();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("niraj")){
            System.out.println("Button 1 pressed");
        }
        else if(e.getActionCommand().equals("prasanna")){
            System.out.println("Button 2 Pressed");
        }
        else{
            System.out.println("Button 3 Pressed");
        }
    }
    
}
