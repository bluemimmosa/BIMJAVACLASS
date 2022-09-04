/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.layoutexample;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CardLayoutExample extends Frame implements ActionListener{
    CardLayout cLayout;
    Button b1, b2, b3, b4, b5;
    //Container containerPane;
    
    public CardLayoutExample(){
        cLayout = new CardLayout();
        this.setLayout(cLayout);
        
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        this.add("a", b1);
        this.add("b", b2);
        this.add("c", b3);
        this.add("d", b4);
        this.add("e", b5);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cLayout.next(this);
    }
    
    public static void main(String[] args) {
        CardLayoutExample cle = new CardLayoutExample();
        cle.setSize(400, 300);
        cle.setVisible(true);
    }
}
