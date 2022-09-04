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

public class TextFieldExample implements ActionListener{
    Frame f;
    TextField tf1;
    Label lbl;
    Button btn;
    
    TextFieldExample(){
        f = new Frame("TextBox Example");
        f.setSize(400, 300);
        
        lbl = new Label("Enter your name: ");
        lbl.setBounds(30, 50, 100, 20);
        
        tf1 = new TextField("Niraj Khadka");
        tf1.setBounds(150, 50, 150, 20);
        tf1.setEditable(true);
        
        System.out.println("The editable flag is : "+tf1.isEditable());
        
        btn = new Button("Submit");
        btn.setBounds(330, 50, 50, 20);
        btn.addActionListener(this);
        
        f.add(lbl); f.add(tf1); f.add(btn);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        TextFieldExample tfe = new TextFieldExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Your name is: "+tf1.getText());
    }
}
