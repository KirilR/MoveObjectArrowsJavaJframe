package com.company;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	JFrame f = new JFrame();
	moving s = new moving();
	f.add(s);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(800,600);

    }
}
