package ru.spb.ilyha.algo;

import java.util.Arrays;


public class ArrayReverse {

    public static void main(String[] args) {
		int[] input = new int[] {1,2,3};
        int[] result = algoImpl(input);
		System.out.println(Helper.intArrayToString(result)); //ожидается 3, 2, 1
    }

    private static int[] algoImpl(int[] input) {
        int[] reverse = new int[input.length];
        for (int i=0; i < input.length; i++) {
            reverse[i] = input[input.length - 1 - i];
        }
        return reverse;
		//Здесь реализация алгоритма, должен возвращать переданный список в обратном порядке
   
    }
}