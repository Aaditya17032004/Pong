package com.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyListner implements KeyListener {
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Hi");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_UP) {
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Hi");

	}

}
