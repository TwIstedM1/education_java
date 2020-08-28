package ru.spb.ilyha.geometry;

public class Square extends Figures{
	private double a;
	
	public Square (double a) {
		this.a = a;
	}
	
	public area() {
		double s = a * a;
		return s;
	}
	
	public perimeter() {
		double p = 4 * a;
		return p;
	}	
}