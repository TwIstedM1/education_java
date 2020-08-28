package ru.spb.ilyha.algo;

import java.util.Arrays;

public class IntArrayList {
	private int[] array;
	private int size = 0;
	
	public IntArrayList (int arraylist) {
		if (arraylist >= 0){
			this.array = new int[arraylist];
		} else {
			throw new IllegalStateException("Size cannot be less than 0!");
		}
	}
	
	public void add(int elem) {
		if (size == array.length) {
			array = increaseArraySize();
		}
		array[size] = elem;
		size ++;
	}
	
	public void add (int elem, int index) {
		checkArrayCapacity(index);
		if (size == array.length) {
			array = increaseArraySize();
		}
        System.arraycopy(array, index, array, index + 1,size - index);
        array[index] = elem;
        size++;
	}
	
	public void addAll(int[] anotherList) {
		int count = size;
		
		if (size <= array.length + anotherList.length) {
			array = increaseArraySize();
		}
		
		for(int j = 0;j<anotherList.length;j++) {
			array[count++] = anotherList[j];
			size++;
		}
	}
	
	public void addAll(int[] anotherList, int index) {	
		checkArrayCapacity(index);
		int count = size;
		
		if (size <= array.length + anotherList.length) {
			array = increaseArraySize();
		}
		
		for(int j = 0;j<anotherList.length;j++) {
			System.arraycopy(array, index, array, index + 1,size - index);
			array[index++] = anotherList[j];
			size++;
		}
	}
	
	public void remove(int index) {
		checkArrayCapacity(index);
		int [] copy_array = array; 
        array = new int [copy_array.length-1];  
        int value = copy_array[index];  
        System.arraycopy(copy_array, 0, array, 0, index); 
        System.arraycopy(copy_array, index + 1, array, index, copy_array.length - index - 1);
		size--;
	}
	
	public int size(){
        return size;
    }
	
	public int get(int index){
        return array[index];
    }
	
	private int checkArrayCapacity(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index can't be found! " + " Max index array = " + array.length);
        }
        return index;
    }
	
	private int[] increaseArraySize(){
        int[] copy_array = new int[(array.length * 2)];  
        System.arraycopy(array, 0, copy_array, 0, array.length);  
        return copy_array;
    }
}