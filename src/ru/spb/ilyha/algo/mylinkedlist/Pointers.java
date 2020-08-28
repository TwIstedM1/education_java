package ru.spb.ilyha.algo.mylinkedlist;

class Pointers<E> {
    E element;
    Pointers<E> next;
    Pointers<E> previous;

    Pointers(E element, Pointers<E> next, Pointers<E> previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }

}
