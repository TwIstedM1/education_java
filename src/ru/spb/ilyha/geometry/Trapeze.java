package ru.spb.ilyha.geometry;

class Trapeze extends Figures{
	private double h;
	private double a;
	private double b;
	private double c;
	
	public Trapeze (double h, double a, double b, double c) {
		this.h = h;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public getArea() {
		double s = 1/2 * a * h;
		return s;
	}
	
	public getPerimeter() {
		double p = a + b + c;
		return p;
	}
}