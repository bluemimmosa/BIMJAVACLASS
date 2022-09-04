/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.awtcontrols;

/**
 *
 * @author Niraj Khadka
 */
import java.awt.*;
public class PixelDraw extends Frame{
    final public int PIXELTHICKNESS = 5;
    int x = 0;
    int y = 0;
    public PixelDraw(){
        this.setTitle("Pixel Draw");
        this.setSize(400,400);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        //g.drawString("", 0, 0);
        g.fillOval(x, y, PIXELTHICKNESS, PIXELTHICKNESS);
        
    }
    
    public void draw(int x, int y){
        this.x = x;
        this.y = y;
        Graphics g = this.getGraphics();
        this.paint(g);
    }
    
    public static void main(String[] args) {
        PixelDraw pd = new PixelDraw();
        pd.draw(60, 60);
//        int x=20;
//        int y=20;
//        for(int i=0; i<350; i++){
//            pd.draw(x+i, y+i);
//        }

    }
}
