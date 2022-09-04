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
public class KeyEventExample implements KeyListener{
    static Frame f;
    static int x =200;
    static int y =200;
    static Panel p;
    TextArea ta;
    
    
    public KeyEventExample(){
        f = new Frame("KeyEvent Example");
        f.setLayout(null);
        f.setSize(400,400);
        p = new Panel();
        p.setSize(400,400);
        f.add(p);
       
        p.addKeyListener(this);
        //f.add(ta);
        
        f.setVisible(true);
        
        
    }
    public static void main(String[] args) {
        KeyEventExample kee = new KeyEventExample();
    }

    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Graphics g = p.getGraphics();
        g.setColor(Color.red);
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                g.setColor(Color.WHITE);
                g.fillOval(x,y, 10, 10);
                y-=5;
                g.setColor(Color.red);
                g.fillOval(x,y, 10, 10);
                break;
            case KeyEvent.VK_DOWN:
                
                g.setColor(Color.WHITE);
                g.fillOval(x,y, 10, 10);
                y+=5;
                g.setColor(Color.red);
                g.fillOval(x,y, 10, 10);
                break;
            case KeyEvent.VK_LEFT:
                
                g.setColor(Color.WHITE);
                g.fillOval(x,y, 10, 10);
                
                x-=5;
                g.setColor(Color.red);
                g.fillOval(x,y, 10, 10);
                break;
            case KeyEvent.VK_RIGHT:
                
                g.setColor(Color.WHITE);
                g.fillOval(x,y, 10, 10);
                x+=5;
                g.setColor(Color.red);
                g.fillOval(x,y, 10, 10);
                break;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
