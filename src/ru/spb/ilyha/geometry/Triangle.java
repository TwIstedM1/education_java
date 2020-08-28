package ru.spb.ilyha.geometry;

class Triangle extends Figures{
	private double h;
	private double a;
	private double b;
	private double c;
	private double d;

	
	public Triangle (double h, double a, double b, double c, double d) {
		this.h = h;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public area() {
		double s = ((a+b)/2)*h;
		return s;
	}
	
	public perimeter() {
		double p = a + b + c + d;
		return p;
	}

}