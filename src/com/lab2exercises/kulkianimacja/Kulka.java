package com.lab2exercises.kulkianimacja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

public class Kulka {
	
	private float x,y;
	private Color c;
	private float r;
		
	private float dx = (float)(8*Math.random()) - 4.0f;
	private float dy = (float)(8*Math.random()) - 4.0f;
	
	public Kulka(Dimension d, float r) {
		this.r = r;
		
		Random rnd = new Random();
		
		this.x = rnd.nextFloat() * d.width;
		this.y = rnd.nextFloat() * d.height;		
		this.c = new Color( rnd.nextFloat(), rnd.nextFloat(), rnd.nextFloat());
		
	}

	public void rysuj(Graphics g) {
		g.setColor(c);
		g.fillOval((int)(x-r), (int)(y-r), (int)(2*r), (int)(2*r) );
	}

	public void przesun(Dimension d) {
		x += dx;
		y += dy;
		// kontrola granic obszaru
//		if( x >= d.width) x -= d.width;
//		if( y >= d.height) y -= d.height;
//		if( x < 0 ) x += d.width;
//		if( y < 0 ) y += d.height;
		if( x >= d.width) dx = -dx;
    	if( y >= d.height) dy = -dy;;
		if( x < 0 ) dx = -dx;
	    if( y < 0 ) dy = -dy;;

	}

//	public void zmienKierunek() {
//	dx = -dx;
//		dy = -dy;
//	}

}
