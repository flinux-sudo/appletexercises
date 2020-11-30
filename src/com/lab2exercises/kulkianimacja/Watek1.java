package com.lab2exercises.kulkianimacja;

public class Watek1 extends Thread {

	@Override
	public void run() {
		while(true){
			System.out.println("Watek 1 - działam!");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
