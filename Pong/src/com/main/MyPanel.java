package com.main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel{
	
	//variables 
	int x = 80;
	int y = 80;
	int bounds = 30;
	boolean move_left;
	boolean move_up;

	int pad1Loc = 10;
	int pad2Loc = 10;
	Paddle player1 = new Paddle(10,pad1Loc);
	Paddle player2 = new Paddle(555,pad2Loc);
	Ball ball = new Ball(x,y);
	
	
	public MyPanel() {
		this.setPreferredSize(new Dimension(500,500));
		this.addKeyListener(new AL());
        this.setFocusable(true);
        this.requestFocusInWindow();
        

        Timer timer = new Timer(10, new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// horizontal motion logic.
				if (x > getWidth() - bounds) {
					move_left = true;
				}
				if (x < 0) {
					move_left = false;
				}
				
				//collision
				if((y >= (pad2Loc-30) && y<= (pad2Loc+30))
					&& ((x >= 545) && (x<= 565))) {
					move_left = true;
				}
				
				if((y >= (pad1Loc-30) && y<= (pad1Loc+30))
						&& ((x >= 5) && (x<= 20))) {
						move_left = false;
					}
				
				// Performing horizontal motion.
					if (move_left) {
						x -= 3;
					}
					else {
						x += 3;
					}
				// vertical motion logic.
				if (y > getHeight() - bounds) {
					move_up = true;
				}
				if (y < 0) {
					move_up = false;
				}
				// Performing vertical motion.
					if (move_up) {
						y -= 3;
					}
					else {
						y += 3;
					}
					
				
					
				
				removeAll();
				ball = new Ball(x,y);
				repaint();// Repaint JComponent.
			}
		});
		timer.start();
		
	}
	
	public void paint(Graphics g) {
        super.paintComponent(g); // key line of code
        
        player1.paintComponent(g);
		player2.paintComponent(g);
		ball.paintComponent(g);
	}		 
	
	public class AL extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == e.VK_UP) {
				pad1Loc -= 10;
				player1= new Paddle(10,pad1Loc);
				
				if(pad1Loc <= 0) {
					pad1Loc = 0;
				}
				
				repaint();
			}
			
			if(e.getKeyCode() == e.VK_DOWN) {
				pad1Loc += 10;
				player1= new Paddle(10,pad1Loc);
				
				if(pad1Loc>=300) {
					pad1Loc = 300;
				}
				repaint();
			}
			
			if(e.getKeyCode() == e.VK_W){
				pad2Loc -= 10;
				player2 = new Paddle(555, pad2Loc);

				if(pad2Loc <= 0) {
					pad2Loc = 0;
				}
				
				repaint();
			}
			
			if(e.getKeyCode() == e.VK_S){
				pad2Loc += 10;
				player2 = new Paddle(555, pad2Loc);
				
				if(pad2Loc >= 300) {
					pad2Loc = 300;
				}

				repaint();
			}
		}
	}
	
	
}
