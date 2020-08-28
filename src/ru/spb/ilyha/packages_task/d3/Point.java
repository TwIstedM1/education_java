package ru.spb.ilyha.packages_task.d3;

public class Point {
	
	private double x;
	private double y;
	private double z;
	
	public Point (double x, double y, double z) {
        this.x = x;
        this.y = y;
		this.z = z;
    }
	
	public String toString() {
		return x + " " + y + " " + z;
	} 
	
	public static Point create (double x, double y, double z) {
		return new Point(x,y,z);
	}
}