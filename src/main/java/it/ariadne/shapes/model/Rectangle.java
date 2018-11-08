package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Rectangle implements Shape{

	private int l;
	private int h;
	
	public Rectangle(int l, int h) {
		this.l = l;
		this.h = h;
	}

	@Override
	public int calculateArea() {
		return this.h * this.l;
	}

}
