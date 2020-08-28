package ru.spb.ilyha.model;

final class MinMax {
	
	final int min;
	final int max;
	
	public MinMax(int min, int max) {
		this.min = min; 
		this.max = max; 
	}
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
}