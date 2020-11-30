package com.lab2exercises.animacja;

import java.applet.Applet;
import java.awt.*;

public class AnimacjaKulek extends Applet implements Runnable {

	Kulka[] tablica;
	
	@Override
	public void init() {		
		System.out.println("zaczynam");
		Dimension d = getSize();
		
		String ile = getParameter("ILE_KULEK");
		int n = 10;
		if( ile != null) {
			try{
				n = Integer.parseInt(ile);
			}catch(NumberFormatException e) {
				System.err.println("Błędna liczba: "+ile);
			}
		}
		
		tablica = new Kulka[n];
		for(int i = 0; i < tablica.length; i++)
			tablica[i] = new Kulka(10 + (int)(Math.random()*40), d);
		
		new Thread(this).start();
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("rysuję");
		for(Kulka k : tablica)
			k.rysuj(g);
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
			Dimension d = getSize();
			for(Kulka k : tablica)
				k.przesun(d);
			repaint();
			System.out.println("Działam");
		}
	}

}
