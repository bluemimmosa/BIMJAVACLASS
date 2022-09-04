/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.firstframeexample;

/**
 *
 * @author Niraj Khadka
 */
import java.awt.*;
public class FirstFrameByExtends extends Frame{
    public FirstFrameByExtends(){
        this.setTitle("NayaFrame");
        this.setSize(500,400);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new FirstFrameByExtends();
    }
  
}
