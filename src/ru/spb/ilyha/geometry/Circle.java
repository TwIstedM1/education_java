package ru.spb.ilyha.geometry;

public class Circle extends Figures implements NumberPi{
	private double radius;
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double s = radius * radius * Pi;
		return s;
	}
	
	public double getPerimeter() {
		double p = radius  * 2 * Pi;
		return p;
	}
}

