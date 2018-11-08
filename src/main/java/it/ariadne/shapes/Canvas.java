package it.ariadne.shapes;

import java.util.List;
import java.util.ArrayList;

public class Canvas {

	private List<Shape> shapes = new ArrayList<>();
	
	public int size() {
		return this.shapes.size();
	}

	public void add(Shape shape) {
		this.shapes.add(shape);
	}

	public int calcAreaTot() {
		int areaTot = 0;
		for (Shape shape: this.shapes) {
			areaTot += shape.calculateArea();
		}
		return areaTot;
	}

}
