/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.eventhandling.KeyEvent;

/**
 *
 * @author Niraj Khadka
 */
import java.awt.*;
import java.awt.event.*;
public class KeyEventExamplesimple extends Frame implements KeyListener{
    public KeyEventExamplesimple(){
        this.setTitle("Keyboard ko example");
        this.setSize(600, 400);
        this.addKeyListener(this);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new KeyEventExamplesimple();
    }
    
    @Override
    public void keyPressed(KeyEvent ke){
        int key = ke.getKeyCode();
        if(key == KeyEvent.VK_UP){
            System.out.println("Up key has been typed!");
        }
        else if(key == KeyEvent.VK_DOWN){
            System.out.println("Down key has been typed!");
        }
        else if(key == KeyEvent.VK_RIGHT){
            System.out.println("Right key has been typed!");
        }
        else if(key == KeyEvent.VK_LEFT){
            System.out.println("Left key has been typed!");
        }
        else{
            System.out.println("Only Up, Down, Right and Left keys are allowed!");
        }
    }
    
    @Override
    public void keyReleased(KeyEvent ke){
        
    }
    
    @Override
    public void keyTyped(KeyEvent ke){
        
    }
}
