package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Triangle implements Shape{

	private int b, h;
	
	public Triangle(int b, int h) {
		this.b = b;
		this.h = h;
	}

	public int calculateArea() {
		return b * h/2;
	}

}
