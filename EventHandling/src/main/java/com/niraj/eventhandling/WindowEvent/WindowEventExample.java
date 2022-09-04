/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.eventhandling.WindowEvent;

/**
 *
 * @author Niraj Khadka
 */
import java.awt.*;
import java.awt.event.*;
public class WindowEventExample extends Frame implements WindowListener {
    public WindowEventExample(){
        this.setTitle("Example fo WindowEvent");
        this.setSize(600, 400);
        this.addWindowListener(this);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new WindowEventExample();
    }
    
    @Override
    public void windowActivated(WindowEvent we){
        //System.out.println("Window has been activated!");
    }
    
    @Override
    public void windowDeactivated(WindowEvent we){
        //System.out.println("Window has been DEACTIVATED!");
    }
    
    @Override
    public void windowIconified(WindowEvent we){
        System.out.println("Window has been minimized!");
    }
    
    @Override
    public void windowDeiconified(WindowEvent we){
        
    }
    
    @Override
    public void windowOpened(WindowEvent we){
        
    }
    
    @Override
    public void windowClosing(WindowEvent we){
        System.out.println("The window is in the process of closing!");
    }
    
    @Override
    public void windowClosed(WindowEvent we){
        
    }
}
