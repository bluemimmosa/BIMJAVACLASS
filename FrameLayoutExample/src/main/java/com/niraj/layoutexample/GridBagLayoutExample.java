/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.layoutexample;

import java.awt.*;


/**
 *
 * @author Dell
 */
public class GridBagLayoutExample extends Frame{
    GridBagLayout gbl;
    GridBagConstraints gbc;
    
    GridBagLayoutExample(){
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
        
        this.setTitle("GridBag");
        this.setLayout(gbl);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        Insets ins = new Insets(10,10,10,10);
        gbc.insets = ins;
        this.add(new Button("Button 1"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(new Button("Button 2"), gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(new Button("Button 3"), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new TextField(), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        this.add(new Button("Master Button"), gbc);
        
        this.setSize(400, 400);
        this.setVisible(true);
        
        
        
    }
    
    public static void main(String[] args){
        new GridBagLayoutExample();
    }
}
