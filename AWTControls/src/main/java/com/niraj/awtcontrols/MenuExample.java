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

public class MenuExample implements ActionListener{
    Frame f;
    Dialog d;
    MenuBar menuBar;
    Menu file, edit, about;
    MenuItem _new, open, close, exit, undo, redo, find, replace, developer, system;
    
    MenuExample(){
        f = new Frame("Menu Example");
        f.setSize(600, 300);
        constructDialog();
        menuBar = new MenuBar();
        
        file = new Menu("File");
        edit = new Menu("Edit");
        about = new Menu("About");
        
        _new = new MenuItem("New");
        
        open = new MenuItem("Open");
        open.setActionCommand("OPEN");
        open.addActionListener(this);
        
        close = new MenuItem("Close");
        
        exit = new MenuItem("Exit");
        exit.setActionCommand("EXIT");
        exit.addActionListener(this);
        
        undo = new MenuItem("Undo");
        
        redo = new MenuItem("Redo");
        
        find = new MenuItem("Find");
        replace = new MenuItem("Replace");
        
        developer = new MenuItem("About Developer");
        developer.setActionCommand("DEV");
        developer.addActionListener(this);
        
        system = new MenuItem("About the System");
        
        file.add(_new); file.add(open); file.add(close); file.add(exit);
        edit.add(undo); edit.add(redo); edit.add(find); edit.add(replace);
        about.add(developer); about.add(system);
        
        menuBar.add(file); menuBar.add(edit); menuBar.add(about);
        
        f.setMenuBar(menuBar);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public void constructDialog(){
        d = new Dialog(f,"About Developers",true);
        d.setLayout(new FlowLayout());
        Button btn = new Button("Ok");
        btn.setActionCommand("OK");
        btn.addActionListener(this);
        Label lbl = new Label("The system has been developed by a developer from NCC college BIM students.");
        d.add(lbl); d.add(btn);
        d.setSize(500, 100);
    }
    
    public static void main(String[] args){
        new MenuExample();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("EXIT")){
            f.dispose();
        }
        else if(e.getActionCommand().equals("OPEN")){
            System.out.println("Open clicked in File Menu.");
        }
        else if(e.getActionCommand().equals("DEV")){
            d.setVisible(true);
        }
        else if(e.getActionCommand().equals("OK")){
            d.dispose();
        }
        else{
            System.out.println("Else case.");
        }
    }
}
