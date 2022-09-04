/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.eventhandling.ActionEvent;

/**
 *
 * @author Dell
 */
import javax.swing.*;
import java.awt.event.*;

public class RadioExample extends JFrame implements ActionListener{
    JRadioButton rbMale, rbFemale, rbOthers;
    ButtonGroup bgGender;
    public RadioExample(){
        this.setSize(400, 300);
        this.setTitle("Radio Button Example");
        
        rbMale = new JRadioButton("Male");
        rbMale.setBounds(10, 10, 100, 20);
        rbMale.setActionCommand("m");
        rbMale.addActionListener(this);
        
        rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(10, 40, 100, 20);
        rbFemale.setActionCommand("f");
        rbFemale.addActionListener(this);
        
        rbOthers = new JRadioButton("Others");
        rbOthers.setBounds(10, 70, 100, 20);
        rbOthers.setActionCommand("o");
        rbOthers.addActionListener(this);
        
        bgGender = new ButtonGroup();
        
        bgGender.add(rbMale);
        bgGender.add(rbFemale);
        bgGender.add(rbOthers);
        
        this.add(rbMale);
        this.add(rbFemale);
        this.add(rbOthers);
        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new RadioExample();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("m")){
            System.out.println("MAle selected.");
        }
        else if(e.getActionCommand().equals("f")){
            System.out.println("Female Selected");
        }
        else{
            System.out.println("Others Selected.");
        }
    }
}
