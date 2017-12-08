package com.company;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FacultyFrame{
    FacultyFrame(){
       // Main.DataList.setData("Hello world");
        JFrame facFrm = new JFrame();
        //facFrm.setLayout(new FlowLayout());
        facFrm.setSize(300,150);
        facFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel facPnl = new JPanel();
        JPanel facPnl2 = new JPanel(); // for buttons
        facPnl.setLayout(new FlowLayout());
        facPnl2.setLayout(new FlowLayout());
        JLabel facLbl = new JLabel("Name : ");
        JTextField facText = new JTextField(5);
        JLabel lblFaculty = new JLabel();

        JLabel facLbl2 = new JLabel("Degree : ");
        JTextField facText2 = new JTextField(5);
        //facText.setBounds(69, 49, 160, 20);
        facPnl.add(facLbl);
        facPnl.add(facText);
        facPnl.add(facLbl2);
        facPnl.add(facText2);
        facFrm.add(facPnl, BorderLayout.NORTH);
        //facFrm.add(facText);
        JButton btnAccept = new JButton("Accept");
        JButton btnClear = new JButton("Clear");
        JButton btnClose = new JButton("Close");

        btnAccept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String[] str = {facText.getText(),  facText2.getText()};

                //Main.DataList.setData(str);
                if(facText.getText().matches("[a-z A-Z]+") && facText2.getText().matches("[a-z A-Z]+")) {
                    MainFrame.setData("Name : " + facText.getText() + "  Age/Degree : " + facText2.getText());
                    lblFaculty.setText("ACCEPTED");
                }
                else  lblFaculty.setText(" NO ACCEPTED");
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                facText.setText("");
                facText2.setText("");
                lblFaculty.setText("CLEAR");
            }
        });
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                facFrm.dispose();
            }
        });

        facPnl2.add(btnAccept);
        facPnl2.add(btnClear);
        facPnl2.add(btnClose);
        facFrm.add(facPnl2, BorderLayout.CENTER);



        facFrm.add(lblFaculty, BorderLayout.SOUTH);
        facFrm.setVisible(true);

    }
}
