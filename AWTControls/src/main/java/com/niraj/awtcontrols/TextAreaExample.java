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

public class TextAreaExample implements ActionListener{
    Frame f;
    TextArea ta;
    Label lbl;
    Button btn;
    
    TextAreaExample(){
        f = new Frame("TextArea Example");
        f.setSize(400, 300);
        
        lbl = new Label("Type some text: ");
        lbl.setBounds(20, 50, 100, 20);
        
        ta = new TextArea("", 4, 20, TextArea.SCROLLBARS_NONE);
        ta.setBounds(30, 80, 300, 100);
        ta.setText("Hi, my name is Niraj! ");
        ta.append("I live in Sankhu!.");
        ta.insert("Indrayani, ",32);
        ta.replaceRange("Thali", 32, 41);
        
        btn = new Button("Click here");
        btn.setBounds(20, 200, 70, 20);
        btn.addActionListener(this);
        
        f.add(lbl); f.add(ta); f.add(btn);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        System.out.println("TEXT Typed: "+ta.getText());
    }
    
    public static void main(String[] args){
        new TextAreaExample();
    }
}
