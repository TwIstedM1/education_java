package ru.spb.ilyha.model;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args){
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5, 5, 2};
		int[] arr2 = new int[] {2, 4, 5 ,6, 7};
		
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		MinMax result = minMax(arr1, arr2);
		System.out.println("Min: "+result.getMin()+" Max: "+ result.getMax());
		System.out.println("uniqueValues = " + Arrays.toString(uniqueValues(arr1, arr2)));
		System.out.println("duplicateValues = " + Arrays.toString(duplicateValues(arr1)));
		
	}
	
	public static MinMax minMax(int[] min, int[] max) {
		int j = min[0];
		for (int i = 0; i < min.length; i++) {
			if (min[i] < min [0]){
				j = min[i];
			}
		}
		int k = max[0];
		for (int i = 0; i < max.length; i++) {
			if (max[i] > max [0]){
				k = max[i];
			}
		}
		return new MinMax(j, k);
	}
	
	public static int[] duplicateValues(int[] x) {
		int[] z = new int[x.length];
		int[] duplicate;
		int lcount = 0;
		int index = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {	
					z[lcount++] = x [i];
				}
			}
		}
		
		duplicate = new int[lcount];
		
		for (int i = 0; i < lcount; i++) {
				duplicate[index++] = z[i];
		} 
		return duplicate;
	}
	
	public static int[] uniqueValues(int[] x, int[] y) {
		int[] z = new int[x.length+y.length];
		int[] unique;
		int count = 0;
		
		Arrays.sort(x);
		Arrays.sort(y);

		for(int i = 0; i < x.length; i++) {
			boolean value = true;
				for(int j = 0; j < y.length; j++) {
					if (x[i] == y[j]) {
						value = false;
					}
				
				}
			if (value == true) {
				z[count++] = x [i];
			}
		}
		for(int i = 0; i < y.length; i++) {
			boolean value = false;
				for(int j = 0; j < x.length; j++) {
					if (y[i] == x[j]) {
						value = true;
					}
				
				}
			if (value == false) {
				z[count++] = y[i];
			}
		}
		
		unique = new int[count];
		int index = 0;
		
		for (int k = 0; k < count; k++) {

			unique[index++] = z[k];

		}
		return unique;
	}
}

