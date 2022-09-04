/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.eventhandling.MouseEvent;

/**
 *
 * @author Niraj Khadka
 */
import java.awt.*;
import java.awt.event.*;
public class MouseExample extends Frame implements MouseListener{
    public MouseExample(){
        this.setTitle("Mouse Example Event");
        this.setSize(400,400);
        this.addMouseListener(this);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MouseExample();
    }
    
    @Override
    public void mouseClicked(MouseEvent me){
//        if(me.getButton()==MouseEvent.BUTTON1){
//            System.out.println("Left button has been clicked.");
//        }
//        else if(me.getButton()==MouseEvent.BUTTON2){
//            System.out.println("Other button has been clicked.");
//        }
//        else{
//            System.out.println("Right button has been clicked.");
//        }
    }
    
    @Override
    public void mouseEntered(MouseEvent me){
        System.out.println("Mouse has entered the Frame!");
    }
    
    @Override
    public void mouseExited(MouseEvent me){
        System.out.println("Mouse has exited the Frame!");
    }
    
    @Override
    public void mousePressed(MouseEvent me){
        
    }
    
    @Override
    public void mouseReleased(MouseEvent me){
        
    }
}
