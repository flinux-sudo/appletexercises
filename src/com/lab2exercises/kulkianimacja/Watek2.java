package com.lab2exercises.kulkianimacja;

public class Watek2 implements Runnable {

	@Override
	public void run() {
		while(true){
			System.out.println("Watek 2 - działam!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
