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

public class TextAreaExample extends JFrame implements ActionListener{
    JTextArea txtArea;
    JButton okBtn;
    public TextAreaExample(){
        this.setSize(400, 300);
        this.setTitle("TextArea Example");
        
        txtArea = new JTextArea();
        txtArea.setBounds(10, 10, 300, 200);
        
        okBtn = new JButton("Submit");
        okBtn.setBounds(10, 220, 100, 20);
        okBtn.addActionListener(this);
        
        this.add(txtArea);
        this.add(okBtn);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TextAreaExample();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("The text in textarea is :\n\n"+txtArea.getText());
    }
}
