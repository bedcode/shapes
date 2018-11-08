package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Square implements Shape{
	
	private int l;

	public Square(int l) {
		this.l = l;
	}

	public int calculateArea() {
		return l * l;
	}
}
