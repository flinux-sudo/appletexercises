package com.lab2exercises.aplecik;

import java.applet.Applet;
import java.awt.*;

/**
 * Aplet z kolorową kulką
 * @author jurczyk
 */
public class ApletKulka extends Applet {

	Kulka[] tablica; // atrybut - tablica kulek

	/**
	 * Wywoływana raz, przy starcie apletu
	 * @see java.applet.Applet#init()
	 */
	@Override
	public void init() {
		int N = 10;		
		String ile = getParameter("ILE_KULEK");
		if(ile != null){
			try{
				N = Integer.parseInt(ile);
			}catch(NumberFormatException ex){				
				System.err.println("Błędna wartość parametru");
			}
		}
		
		Dimension d = getSize();
		
		tablica = new Kulka[N]; 
		
		for(int i = 0; i < tablica.length; i++)
			tablica[i] = new Kulka(30, d);		
	}

	/** 
	 * Wywoływana, gdy aplet potrzebuje być odrysowany
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		for(Kulka k : tablica)
			k.rysuj(g);
	}
}
