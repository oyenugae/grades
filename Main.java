package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        int [] grade = new int[8];
        int totalGrade=0;
        float averageGrade;
        String passFail = "";
        name = JOptionPane.showInputDialog( "Enter your full name" );
        //this gets the grades
        for (int i=0; i<grade.length; i++){
            grade[i] = Integer.parseInt( JOptionPane.showInputDialog( "Enter Grade" + (i+1) ));
        }
// this sums up the grades
        for (int i=0; i<grade.length; i++){
            totalGrade += grade[i];
        }

        averageGrade = totalGrade/grade.length;
// checks if student pass or fail based on the averageGrade
        if (averageGrade < 50)
            passFail = "FAIL";
        else
            passFail = "PASS";
        JOptionPane.showMessageDialog(null, name +"\n Total Grade = "+totalGrade+"\n Average Grade ="+ averageGrade +"\n"+passFail, "Student Grade", JOptionPane.WARNING_MESSAGE);   }
    }

