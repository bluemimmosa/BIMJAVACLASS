/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.eventhandling.ActionEvent;

/**
 *
 * @author Niraj
 */
import javax.swing.*;
import java.awt.event.*;

public class Welcome implements ActionListener, ItemListener{
    JFrame jf;
    JCheckBox cb1, cb2, cb3;
    JButton btnOk;
    
    public Welcome(){
        //Frame lai initialize ra configure garne code..
        jf = new JFrame("Welcome");
        jf.setSize(400, 300);
        jf.setLayout(null);
        
        cb1 = new JCheckBox("Item1");
        cb1.setBounds(10, 10, 100, 20);
        cb2 = new JCheckBox("Item2");
        cb2.setBounds(10,40,100,20);
        cb2.addItemListener(this);
        cb3 = new JCheckBox("Item3");
        cb3.setBounds(10, 70, 100, 20);
        cb3.setEnabled(false);
        
        btnOk = new JButton("Press me");
        btnOk.setBounds(10, 100, 100, 20);
        //btnOk.disable();
        btnOk.addActionListener(this);
        
        jf.add(cb1);
        jf.add(cb2);
        jf.add(cb3);
        jf.add(btnOk);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
        Welcome wel = new Welcome();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!cb1.isSelected() && !cb2.isSelected() && !cb3.isSelected()){
            System.out.println("No any item has been selected.");
        }
        else{
            if(cb1.isSelected()){
                System.out.println("The Item1 is selcted.");
            }
            
            if(cb2.isSelected()){
                System.out.println("The item2 is selected");
           
            }
       
            if(cb3.isSelected()){
                System.out.println("The item3 is selected");
            }
        }
        
//       if(cb1.isSelected()){
//           System.out.println("The Item1 is selcted.");
//       }
//       else if(cb2.isSelected()){
//           System.out.println("The item2 is selected");
//           
//       }
//       
//       else if(cb3.isSelected()){
//           System.out.println("The item3 is selected");
//       }
//       else{
//           System.out.println("No any item is selected.");
//       }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(cb2.isSelected()){
            cb3.setEnabled(true);
        }
        else{
            cb3.setEnabled(false);
        }
    }
    
   
}
