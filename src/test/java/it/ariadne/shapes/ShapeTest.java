package it.ariadne.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

import it.ariadne.shapes.model.Circle;
import it.ariadne.shapes.model.Rectangle;
import it.ariadne.shapes.model.Square;
import it.ariadne.shapes.model.Triangle;

public class ShapeTest {

	@Test
	public void testCircleArea() {
		Circle circle = new Circle(2);
		Circle circle2 = new Circle(3);
		int circleArea = circle.calculateArea();
		int circleArea2 = circle2.calculateArea();
		
		// ASSERT FIRST
		assertEquals("L'area di un cerchio con raggio 2 è 12", 12, circleArea);
		// TRIANGULATE
		assertEquals("L'area di un cerchio con raggio 3 è 27", 27, circleArea2);
	}

	@Test
	public void testSquareArea() {
		Square square = new Square(2);
		int squareArea = square.calculateArea();
		Square square2 = new Square(3);
		int squareArea2 = square2.calculateArea();
		assertEquals("L'area di un quadrato con lato 2 è 4", 4, squareArea);
		assertEquals("L'area di un quadrato con lato 3 è 9", 9, squareArea2);
	}
	
	@Test
	public void testTriangleArea() {
		Triangle triangle = new Triangle(2, 2);
		int triangleArea = triangle.calculateArea();
		Triangle triangle2 = new Triangle(2, 3);
		int triangleArea2 = triangle2.calculateArea();
		assertEquals("L'area di un triangolo con base 2 e altezza 2 è 2", 2, triangleArea);
		assertEquals("L'area di un triangolo con base 3 e altezza 2 è 3", 3, triangleArea2);
	}
	
	@Test
	public void testAddCanvas() {
		Canvas canvas = new Canvas();
		Circle circle = new Circle(3);
		canvas.add(circle);
		Triangle triangle = new Triangle(2, 3);
		canvas.add(triangle);
		Square square = new Square(2);
		canvas.add(square);
		int canvasSize = canvas.size();
		assertEquals("Il canvas a cui ho aggiunto 3 forme ha dimensione 3", 3, canvasSize);
	}
	
	@Test
	public void testAreaTotCanvas() {
		Canvas canvas = new Canvas();
		Circle circle = new Circle(2);
		canvas.add(circle);
		Triangle triangle = new Triangle(2, 2);
		canvas.add(triangle);
		Square square = new Square(2);
		canvas.add(square);
		Rectangle rect = new Rectangle(2, 4);
		canvas.add(rect);
		int areaTot = canvas.calcAreaTot();
		
		Canvas canvas2 = new Canvas();
		Circle circle2 = new Circle(3);
		canvas2.add(circle2);
		Triangle triangle2 = new Triangle(2, 3);
		canvas2.add(triangle2);
		Square square2 = new Square(3);
		canvas2.add(square2);
		int areaTot2 = canvas2.calcAreaTot();
		assertEquals("L'area totale del canvas è 26", 26, areaTot);
		assertEquals("L'area totale del canvas è 39", 39, areaTot2);
	}
	
}
