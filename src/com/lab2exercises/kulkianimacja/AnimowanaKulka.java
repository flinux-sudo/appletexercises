package com.lab2exercises.kulkianimacja;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

public class AnimowanaKulka extends Applet implements Runnable {

	Kulka[] kulki;  // tablica kulek
	
	@Override
	public void init() {
		Dimension d = getSize();
		
		final int ILE = 1;
		kulki = new Kulka[ILE];
		for(int i = 0; i < kulki.length; i++)
			kulki[i] = new Kulka(d, 20);
		
		Thread t = new Thread( this );
		t.start();
	
//		TimerTask zadanie = new TimerTask() {
//			@Override
//			public void run() {
//				System.out.println("Zmiana kierunku!");
//				for(Kulka k : kulki)
//					k.zmienKierunek();

//			}
//		};
		
//		Timer tt = new Timer();
//		tt.schedule(zadanie, 5000, 3000 );
	}

	@Override
	public void paint(Graphics g) {
		for(Kulka k : kulki)
			k.rysuj(g);
	}

	public void run() {
		while(true){
			// usypiam
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// przesuwam
			Dimension d = getSize();
			for(Kulka k : kulki)
				k.przesun(d);
			// informuje o potrzebie odswiezenia
			repaint();
		}
	}
	
}
