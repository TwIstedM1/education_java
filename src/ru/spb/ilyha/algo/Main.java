package ru.spb.ilyha.algo;

import ru.spb.ilyha.algo.mylinkedlist.MyLinkedList;

public class Main {
    
    public static void main(String[] args){
    	MyLinkedList<Object> myLL = new MyLinkedList<>();
    	myLL.addFirst("1");
    	myLL.addLast("2");

		System.out.println(myLL.size());
		System.out.println(myLL.element());
		myLL.removeFirst();
		System.out.println(myLL.getFirst());

	}
}