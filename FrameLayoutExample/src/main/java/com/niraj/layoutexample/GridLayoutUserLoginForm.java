/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.layoutexample;

/**
 *
 * @author Niraj Khadka
 */
import java.awt.*;
public class GridLayoutUserLoginForm extends Frame{
    Label lblUserName, lblPassword;
    TextField txtUserName, txtPassword;
    Button btnLogin, btnCancel;
    GridBagLayout gbl;
    GridBagConstraints gbc;
    
    GridLayoutUserLoginForm(){
        this.setTitle("User Login Form");
        this.setSize(400, 300);
        
        lblUserName = new Label("Username: ");
        lblPassword = new Label("Password: ");
        txtUserName = new TextField();
        txtPassword = new TextField();
        btnLogin = new Button("Login");
        btnCancel = new Button("Cancel");
        
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints(); 
        gbc.insets = new Insets(5, 5, 5, 5);
        this.setLayout(gbl);
        
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbl.setConstraints(lblUserName, gbc);
        this.add(lblUserName, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbl.setConstraints(txtUserName, gbc);
        this.add(txtUserName, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbl.setConstraints(lblPassword, gbc);
        this.add(lblPassword, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbl.setConstraints(txtPassword, gbc);
        this.add(txtPassword, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbl.setConstraints(btnLogin, gbc);
        this.add(btnLogin, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbl.setConstraints(btnCancel, gbc);
        this.add(btnCancel, gbc);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GridLayoutUserLoginForm();
    }
}
