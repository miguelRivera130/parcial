package model;

import processing.core.PApplet;

import processing.core.PImage;

public class Main extends PApplet {

	private Logica logica;
	static PImage fondo, iconos;

	public static void main(String[] args) {
		PApplet.main("model.Main");
		// TODO Auto-generated method stub

	}

	public void settings() {
		background(0,0,0);
		size(700, 600);
	}

	public void setup() {
	}

public void draw() {
	logica.pintar(null);
	}
}
