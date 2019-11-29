package model;

import java.util.ArrayList;
import java.util.prefs.BackingStoreException;

import javax.swing.Box.Filler;

import model.Personaje;
import processing.core.PApplet;

public class Logica extends Thread {

	private Personaje personajes;
	private int numPer;
	private PApplet app;

	public void logica() {

		for (int i = 0; i < numPer; i++) {
			Personaje temp = new Personaje(Math.floor(Math.random() * 0 + 10), Math.floor(Math.random() * 0 + 50));
			new Thread(temp).start();
			personajes.add(temp);

		}
	}

	public void pintar(PApplet processing) {
		processing.background(255);
		for (int i = 0; i < this.numPer; i++) {
			this.personajes.pintar();

		}
	}

	public void mousePressed() {
		if (dist(this.personajes.getPosX(), this.personajes.getPosY(), app.mouseX, app.mouseY > 25)) {
			System.out.print(numPer);
			this.numPer += 1;
		}

		if (dist(this.personajes.getPosX(), this.personajes.getPosY(), app.mouseX, app.mouseY <= 25)) {
			this.personajes.setSeleccionado(true);
		}
	}
}
