package ru.spb.ilyha.algo.mylinkedlist;

import java.util.*;

public class MyLinkedList<E> implements Deque<E> {
    int size = 0;
    Pointers<E> first;
    Pointers<E> last;

    @Override
    public void addFirst(E e) {
        Pointers<E> f = first;
        Pointers<E> newPointers = new Pointers<>(e, f, null);
        first = newPointers;
        if (f == null){ last = newPointers;}
        else {f.previous = newPointers;}
        size++;
    }

    @Override
    public void addLast(E e) {
        Pointers<E> l = last;
        Pointers<E> newPointers = new Pointers<>(e, null, l);
        last = newPointers;
        if (l == null){ first = newPointers;}
        else {l.next = newPointers;}
        size++;
    }

    @Override
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        addFirst(e);
        return true;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }
    
    @Override
    public E getFirst() {
        return (E)first;
    }

    @Override
    public E getLast() {
        return (E)last;
    }

    @Override
    public E peekFirst() {
        return (E)first;
    }

    @Override
    public E peekLast() {
        return (E)last;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        add(e);
        return true;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() { return first == null || last == null; }

    @Override
    public Iterator<E> iterator() {//добавить методы нект и хезнекст
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

}

