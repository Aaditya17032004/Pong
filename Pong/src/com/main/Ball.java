package com.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;



public class Ball extends Rectangle {

	private static final long serialVersionUID = 1L;
	// Global variables. 
	int x, y; 
	int bounds = 30;
	boolean move_up, move_left;

		public Ball(int x, int y) {
			this.x = x;
			this.y = y;
		}
				
	public void paintComponent(Graphics g) {						// This method is called using EDT, it does not need to be called. 
		Graphics2D g2d = (Graphics2D) g;						// Conversion from Graphics to Graphics2D.
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	// Better resolution of the shapes.
				g2d.setColor(Color.RED);					// Setting color of all shapes below.
					g2d.fillOval(x, y, bounds, bounds);			// Draw the circle.
						g2d.dispose();					// Memory optimization. Helps a lot if method has create new shape objects.
			Toolkit.getDefaultToolkit().sync();					// Rendering are OS dependent. This line makes animation smoother on Linux.
	}
	
}