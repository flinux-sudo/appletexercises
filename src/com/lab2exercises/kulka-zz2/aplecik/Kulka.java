package aplecik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Kulka {
	int r = 50; // promień - atrybuty klasy
	Color c; // kolor kółka - atrybut klasy
	int x;	// współrzędna x - atrybut klasy
	int y;	// współrzędna y - atrybut klasy
	
	/**
	 * @param r - promień koła
	 * @param c - kolor koła
	 * @param x - współrzędna x
	 * @param y - współrzędna y
	 */
	public Kulka(int r, Color c, int x, int y) {
		this.r = r;
		this.c = c;
		this.x = x;
		this.y = y;
	}

	public Kulka(int r, Dimension d) {
		this.r = r;
		x = r + (int) (Math.random() * (d.width - 2*r));
		y = r + (int) (Math.random() * (d.height - 2*r));
		c = new Color(
				(float) Math.random(), 
				(float) Math.random(), 
				(float) Math.random());
	}

	public void rysuj(Graphics g) {
		g.setColor(c);			
		g.fillOval(x-r, y-r, 2*r, 2*r);		
	}
}
