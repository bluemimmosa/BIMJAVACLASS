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

public class TextFieldExampleSecB implements ActionListener{
    Frame f;
    TextField tf;
    Label lbl;
    Button btn, btnClear;
    
    TextFieldExampleSecB(){
        f = new Frame("TextField Example");
        f.setSize(400,300);
        
        lbl = new Label("Name: ");
        lbl.setBounds(50, 50, 100, 25);
        
        tf = new TextField();
        tf.setText("Unika Subedi");
        //tf.select(6, 12);
        tf.setEditable(true);
        tf.setBounds(160, 50, 100, 25);
        
        btn = new Button("Submit");
        btn.setActionCommand("SUBMIT");
        btn.addActionListener(this);
        btn.setBounds(130, 100, 60, 25);
        
        btnClear = new Button("Clear");
        btnClear.setActionCommand("CLEAR");
        btnClear.addActionListener(this);
        btnClear.setBounds(240, 100, 60, 25);
        
        
        f.add(lbl); f.add(tf); f.add(btn); f.add(btnClear);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
     new TextFieldExampleSecB();   
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("SUBMIT")){
            System.out.println("Your name is: "+tf.getText());
        }
        else if(e.getActionCommand().equals("CLEAR")){
            tf.setText("");
        }
        else{
            System.out.println("Please press appropriate button.");
        }
        
    }
}
