package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainFrame {
    private static ArrayList<String> dataList = new ArrayList<String>();
    MainFrame(){
        JFrame frmMain = new JFrame();
        frmMain.setSize(400, 200);
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pnlMain = new JPanel();
        //JPanel pnlTable = new JPanel();
        JLabel lblMain = new JLabel();
        DefaultListModel dfl = new DefaultListModel();
        JList<String> jlist = new JList<String>(dfl);
        JScrollPane scrList = new JScrollPane(jlist);
        //scrList.setForeground(pnlMain.getForeground());



        //String[] columns = {"Name", "Age/Degree"};
      //  String[][] str2 = new String[Main.DataList.getData().size()][2];
       // for(int i = 0; i < Main.DataList.getData().size(); i++){
       //     str2[i] = Main.DataList.getData().get(i);
       // }
        //String[][] str3 = new String[1][2];
        //String[][] str4 = new String[][]{{"Hello", "World"},{"qwerty", "wasd"}};
       // JTable tablePrint = new JTable(str2, columns);
        //JScrollPane jscr = new JScrollPane(tablePrint);
        //JLabel lblPrint = new JLabel();

        JButton btnStudent = new JButton("Student data");
        JButton btnFaculty = new JButton("Faculty data");
        JButton btnPrint = new JButton("Print the list");
        btnStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentFrame studFrm = new StudentFrame();
            }
        });
        btnFaculty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FacultyFrame facFrm = new FacultyFrame();
            }
        });
        btnPrint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         /*      String[] str = {"Name", "Age/Degree"};
               String[][] str2 = new String[Main.DataList.getData().size()][2];
               for(int i = 0; i < Main.DataList.getData().size(); i++){
                   str2[i] = Main.DataList.getData().get(i);
               }
               JTable table = new JTable(str4, columns);
                //tablePrint = new JTable(str2, columns);
                tablePrint.add(table);
//                frmMain.add(tablePrint);
               // pnlTable.add(tablePrint);
                //frmMain.add(pnlTable);
                JScrollPane jscr = new JScrollPane(tablePrint);
                jscr.setPreferredSize(new Dimension(200,300));
                frmMain.add(jscr, BorderLayout.CENTER);
                //fireTableDataChanged();
                frmMain.setVisible(true);
            */
                dfl.removeAllElements();
                for(int i = 0; i < getData().size(); i++) {
                    dfl.addElement(getData().get(i));
                }
            }
        });

        pnlMain.add(btnStudent);
        pnlMain.add(btnFaculty);
        pnlMain.add(btnPrint);
        frmMain.add(pnlMain, BorderLayout.NORTH);
        //pnlTable.add(tablePrint);

        //frmMain.add(pnlTable, BorderLayout.CENTER);
       // JScrollPane jscr = new JScrollPane(tablePrint);
        //frmMain.add(jscr, BorderLayout.CENTER);
        frmMain.add(scrList, BorderLayout.CENTER);
        frmMain.add(lblMain, BorderLayout.SOUTH);
        frmMain.setVisible(true);

    }
    public static List<String> getData(){
        return dataList;
    }
    public static void setData(String str){

        dataList.add(str);
    }

}
