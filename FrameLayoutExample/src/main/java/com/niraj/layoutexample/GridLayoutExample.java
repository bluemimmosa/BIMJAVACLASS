/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.layoutexample;

/**
 *
 * @author Dell
 */
import java.awt.*;

public class GridLayoutExample {
    Frame f;
    Button btn[] = new Button[26];
    
    
    
    public GridLayoutExample(){
        f = new Frame("Grid Layout");
        
        f.setLayout(new GridLayout(6,5,5,5));
        f.setSize(600,750);       
        for(int i=0; i<26; i++){
            char c = (char)(i+65); //ASCII of A is decimal 65
            btn[i] = new Button(""+c);
            f.add(btn[i]);
        }
        
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutExample();
    }
    
}
