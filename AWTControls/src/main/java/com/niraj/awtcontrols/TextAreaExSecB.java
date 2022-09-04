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
import java.awt.event.*;

public class TextAreaExSecB implements ActionListener{
    Frame f;
    TextArea ta1, ta2;
    Label lbl;
    Button btn, btn2;
    
    TextAreaExSecB(){
        f = new Frame("TextArea Example");
        f.setSize(500, 300);
        
        lbl = new Label("Enter the text here:");
        lbl.setBounds(20, 30, 100, 25);
        
        ta1 = new TextArea("Niraj", 5, 10, TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta1.setBounds(30, 70, 200, 150);
        
        ta2 = new TextArea();
        ta2.setBounds(250, 70, 200, 150);
        
        btn = new Button("Submit");
        btn.setBounds(100, 250, 60, 25);
        btn.setActionCommand("s");
        btn.addActionListener(this);
        
        btn2 = new Button("Append");
        btn2.setBounds(300, 250, 60, 25);
        btn2.setActionCommand("a");
        btn2.addActionListener(this);
        
        f.add(lbl); f.add(ta1); f.add(btn); f.add(ta2); f.add(btn2);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TextAreaExSecB();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("s")){
//            System.out.println("Full text is: "+ta1.getText());
//            ta1.insert(ta2.getText(), 4);
              ta1.replaceRange(ta2.getText(), 4, 10);
            return;
        }
        if(e.getActionCommand().equals("a")){
            ta1.append(" "+ta2.getText());
            return;
        }
        
    }
}
