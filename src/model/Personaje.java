package model;

import processing.core.PImage;
import processing.core.PApplet;

public class Personaje implements Runnable {

	private int unSimpsons, tamano, vel;
	private int edad, numSuerte;
	private PImage seleccionSimpson;
	static PImage homer;
	static PImage bartolome;
	private PApplet app;
	private float posX, posY;
	private boolean seleccionado;

	public Personaje(double edad, double numSuerte) {
		this.posX = app.random(190, app.width - 40);
		this.posY = app.random(25, app.height - 50);
		this.vel = 25;
		this.seleccionado = false;
		this.unSimpsons = 1;
		if (unSimpsons >= 3) {
			unSimpsons = 1;
		}

		if (Personaje.homer == null) {
			Personaje.homer = app.loadImage("./../data/bart_simpson.png");
		}
		if (Personaje.bartolome == null) {
			Personaje.bartolome = app.loadImage("./../data/bart_simpson.png");
		}

		switch (this.unSimpsons) {
		case 1:
			tamano = 20;
			this.seleccionSimpson = Personaje.homer;
			break;
		case 2:
			tamano = 25;
			this.seleccionSimpson = Personaje.bartolome;
			break;

		}

	}

	public void pintar() {

		app.image(seleccionSimpson, posX, posY, tamano, tamano);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (this.seleccionado == false) {
			this.posY += this.vel;
		} else if (this.seleccionado == true) {
			this.posX = app.mouseX;
			this.posY = app.mouseY;
		}

	}

	public int getUnSimpsons() {
		return unSimpsons;
	}

	public void setUnSimpsons(int unSimpsons) {
		this.unSimpsons = unSimpsons;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public boolean isSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumSuerte() {
		return numSuerte;
	}

	public void setNumSuerte(int numSuerte) {
		this.numSuerte = numSuerte;
	}

}
