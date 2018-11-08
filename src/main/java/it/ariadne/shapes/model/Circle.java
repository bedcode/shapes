package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Circle implements Shape{

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int calculateArea() {
		return radius * radius * 3;
	}

}
