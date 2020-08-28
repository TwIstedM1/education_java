package ru.spb.ilyha.geometry;

public abstract class Figures{

	public abstract double getArea();
	public abstract double getPerimeter();
	
	public double ratioAreaPerimeter() {
		double t = getArea()/getPerimeter();
		return t;
	}
}

