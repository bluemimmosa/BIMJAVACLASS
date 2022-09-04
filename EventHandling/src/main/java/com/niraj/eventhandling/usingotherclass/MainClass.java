/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.eventhandling.usingotherclass;

/**
 *
 * @author Niraj Khadka
 */
import java.awt.*;
public class MainClass {
    Frame f;
    Outer wlo;
    
    public MainClass(){
        f = new Frame("Title");
        wlo = new Outer();
        f.setSize(400,400);
        f.addWindowListener(wlo);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MainClass();
    }
    
}
