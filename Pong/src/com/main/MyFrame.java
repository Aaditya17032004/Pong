package com.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		this.setPreferredSize(new Dimension(600,400));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Pong");
	}
	
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
		MyPanel panel = new MyPanel();
		Paddle player1 = new Paddle(10,10);
		
		frame.add(panel);
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);

	}

	
	
	
}