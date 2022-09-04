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
public class MutuallyExcluCheckBox implements ActionListener {
    Frame f;
    CheckboxGroup cbg;
    Checkbox cb1, cb2, cb3;
    Label l1;
    Button b1;
    
    public MutuallyExcluCheckBox(){
        f = new Frame("Radio Buttons.");
        f.setSize(400,300);
        l1 = new Label("Choose your Gender: ");
        l1.setBounds(50, 50, 200, 20);
        cbg = new CheckboxGroup();
        cb1 = new Checkbox("Male", true, cbg);
        cb1.setBounds(100, 100, 100, 30);
        cb2 = new Checkbox("FeMale", false, cbg);
        cb2.setBounds(100, 130, 100, 30);
        cb3 = new Checkbox("Others", false, cbg);
        cb3.setBounds(100, 160, 100, 30);
        
        b1 = new Button("Click me");
        b1.addActionListener(this);
        b1.setBounds(50, 200, 100, 30);
        
        f.add(l1); f.add(cb1); f.add(cb2); f.add(cb3); f.add(b1);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        new MutuallyExcluCheckBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("The selected Cehckbox is: "+cbg.getSelectedCheckbox().getLabel());
    }
}
