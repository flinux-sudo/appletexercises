package com.lab2exercises.animacja;

import java.awt.*;

public class Kulka {

	// kolor kulki
	private Color c = new Color(
			(float)Math.random(),
			(float)Math.random(),
			(float)Math.random() );
	private int x,y; // współrzędne środka
	private int r;	// promień kulki
	
	// atrybuty dx, dy - przesunięcie ustawiane jako losowe wartości [-10, 10]
	// x, y, dx, dy - rzeczywiste
	
	
	public Kulka(int r, Dimension d) {
		this.r = r;
		x = r + (int) (Math.random() * (d.width-2*r)); // x, y -> kulka w całości w obszarze appletu
		y = r + (int) (Math.random() * (d.height-2*r));		
	}

	/**
	 * Rysuje kulkę na obszarze appletu
	 * @param g Kontekst graficzny
	 */
	public void rysuj(Graphics g) {
		g.setColor(c);
		g.fillOval(x-r, y-r, 2*r, 2*r);
	}

	public void przesun(Dimension d) {
		y++;		
		if(y>d.height) y = 0;
	}
	
}
