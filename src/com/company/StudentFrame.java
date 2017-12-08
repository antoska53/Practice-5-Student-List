package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentFrame {
    StudentFrame(){
        // Main.DataList.setData("Hello world");
        JFrame studFrm = new JFrame();
        //facFrm.setLayout(new FlowLayout());
        studFrm.setSize(300,150);
        studFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel studPnl = new JPanel();
        JPanel studPnl2 = new JPanel(); // for buttons
        studPnl.setLayout(new FlowLayout());
        studPnl2.setLayout(new FlowLayout());
        JLabel studLbl = new JLabel("Name : ");
        JTextField studText = new JTextField(5);
        JLabel lblStudent = new JLabel();

        JLabel studLbl2 = new JLabel("Age : ");
        JTextField studText2 = new JTextField(5);
        //facText.setBounds(69, 49, 160, 20);
        studPnl.add(studLbl);
        studPnl.add(studText);
        studPnl.add(studLbl2);
        studPnl.add(studText2);
        studFrm.add(studPnl, BorderLayout.NORTH);
        //facFrm.add(facText);
        JButton btnAccept = new JButton("Accept");
        JButton btnClear = new JButton("Clear");
        JButton btnClose = new JButton("Close");

        btnAccept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String[] str = {facText.getText(),  facText2.getText()};

                //Main.DataList.setData(str);
                if(studText2.getText().matches("[\\d]+") && studText.getText().matches("[a-z A-Z]+")) {
                    MainFrame.setData("Name : " + studText.getText() + "  Age/Degree : " + studText2.getText());
                    lblStudent.setText("ACCEPTED");
                }
                else  lblStudent.setText(" NO ACCEPTED");
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studText.setText("");
                studText2.setText("");
                lblStudent.setText("CLEAR");
            }
        });
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studFrm.dispose();
            }
        });

        studPnl2.add(btnAccept);
        studPnl2.add(btnClear);
        studPnl2.add(btnClose);
        studFrm.add(studPnl2, BorderLayout.CENTER);

        studFrm.add(lblStudent, BorderLayout.SOUTH);



        studFrm.setVisible(true);

    }
}
