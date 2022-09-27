package com.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JComponent;

public class Paddle extends JComponent{
	
	int locX;
	int locY;
	
	public Paddle(int locX, int locY) {
		this.locX = locX;
		this.locY = locY;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;						// Conversion from Graphics to Graphics2D.
		super.paintComponent(g2d);							// I don't know what that.
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	// Better resolution of the shapes.
		g2d.setColor(Color.RED);
		
		g2d.fillRect(locX, locY, 20, 60);
				
	}
	
}
