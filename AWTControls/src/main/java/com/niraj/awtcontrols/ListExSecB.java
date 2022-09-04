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
public class ListExSecB implements ActionListener {
    Frame f;
    List l;
    Button btn;
    
    ListExSecB(){
        f = new Frame("List Example");
        f.setSize(400, 300);
        btn = new Button("Click");
        
        l = new List(5, true);
        l.add("Manoj");
        l.add("Swostika");
        l.add("Pukar");
        l.add("Rachana");
        l.add("Niraj");
        l.add("Prakash");
        l.add("Srija");
        
        btn.addActionListener(this);
        
        
        f.add(l);
        f.add(btn);
        
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ListExSecB();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] names = l.getSelectedItems();
        for(String s:names){
            System.out.println(s);
        }
        
    }
}
