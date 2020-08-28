package ru.spb.ilyha.packages_task.d2;

public class Point {
	
	private double x;
	private double y;
	
	public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
	
	public String toString() {
		return x + " " + y;
	}
	
	public static Point create (double x, double y) {
		return new Point(x,y);
	}
}