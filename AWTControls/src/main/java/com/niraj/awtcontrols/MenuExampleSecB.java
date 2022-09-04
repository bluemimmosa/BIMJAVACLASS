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

public class MenuExampleSecB implements ActionListener {
    Frame f;
    MenuBar mb;
    Menu file, edit, help, about;
    MenuItem _new, open, close, exit, undo, redo,aboutDev, aboutSys;
    Dialog db;
    Label lbl;
    Button btn;
    
    MenuExampleSecB(){
        f = new Frame("Menu Example");
        mb = new MenuBar();
        file = new Menu("File");
        edit = new Menu("Edit");
        help = new Menu("Help");
        about = new Menu("About");
        
        _new = new MenuItem("New File");
        open = new MenuItem("Open File");
        close = new MenuItem("Close");
        
        exit = new MenuItem("Exit");
        exit.setActionCommand("exit");
        exit.addActionListener(this);
        
        undo = new MenuItem("Undo");
        redo = new MenuItem("Redo");
        
        aboutDev = new MenuItem("Developers");
        aboutDev.setActionCommand("aboutDev");
        aboutDev.addActionListener(this);
        
        aboutSys = new MenuItem("System");
        
        file.add(_new); file.add(open); file.add(close); file.add(exit);
        edit.add(undo); edit.add(redo);
        about.add(aboutDev); about.add(aboutSys);
        help.add(about);
        
        mb.add(file); mb.add(edit); mb.add(help);
        
        db = new Dialog(f, "About Developers", true);
        db.setSize(300, 150);
        db.setLayout(null);
        lbl = new Label("(c) 2021 , Synergy Automation and Instrumentation.");
        lbl.setBounds(30, 30, 250, 25);
        db.add(lbl);
        btn = new Button("OK");
        btn.setActionCommand("ok");
        btn.addActionListener(this);
        btn.setBounds(160, 70, 40, 25);
        db.add(btn);
        db.setVisible(false);
        
        
        f.setMenuBar(mb);
        
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MenuExampleSecB();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals(exit.getActionCommand())){
            f.dispose();
            return;
        }
        
        if(e.getActionCommand().equals(aboutDev.getActionCommand())){
            db.setVisible(true);
            return;
        }
        
        if(e.getActionCommand().equals(btn.getActionCommand())){
            db.setVisible(false);
        }
        
    }
}
