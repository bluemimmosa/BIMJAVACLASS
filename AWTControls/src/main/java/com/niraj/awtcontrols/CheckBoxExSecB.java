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

public class CheckBoxExSecB implements ActionListener{
    Frame f;
    Checkbox cb1, cb2, cb3;
    Label l1;
    CheckboxGroup cbg;
    Button btn;
    
    CheckBoxExSecB(){
        f = new Frame("Checkbox Example");
        f.setSize(400, 300);
        
        cbg = new CheckboxGroup();
        
        cb1 = new Checkbox("Male", cbg, false);
        cb1.setBounds(100, 100, 100, 30);
        cb3 = new Checkbox("Others", cbg, true);
        cb3.setBounds(100, 200, 100, 30);
        cb2 = new Checkbox("Female", cbg, false);
        cb2.setBounds(100, 150, 100, 30);
        
        l1 = new Label("Select your gender: ");
        l1.setBounds(50, 50, 200, 30);
        
        btn = new Button("Click me!");
        btn.addActionListener(this);
        btn.setBounds(100, 250, 50, 30);
        
        f.add(l1); f.add(cb1); f.add(cb2); f.add(cb3); f.add(btn);

        f.setLayout(null);
        f.setVisible(true);  
    }
    
    public static void main(String[] args){
        new CheckBoxExSecB();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        System.out.println("The gender selected is: "+cbg.getSelectedCheckbox().getLabel());
    }
    
}
