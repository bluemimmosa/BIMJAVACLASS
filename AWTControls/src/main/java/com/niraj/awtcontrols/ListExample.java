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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListExample implements ItemListener {
    Frame f;
    List l;
    
    ListExample(){
        f = new Frame("List");
        f.setSize(400, 300);
        
        l = new List();
        l.add("Niraj");
        l.add("Ramesh");
        l.add("Bina");
        l.add("Bikash");
        l.add("Bishnu");
        
        l.addItemListener(this);
        
        l.setBounds(50, 50, 100, 50);
        
        f.add(l);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ListExample();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("The selected item is: "+l.getSelectedItem());
    }
}
