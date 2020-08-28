package ru.spb.ilyha.algo.mylinkedlist;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class MyLinkedList<E> implements Deque {
    int size = 0;
    Pointers<Object> first;
    Pointers<Object> last;

    @Override
    public void addFirst(Object e) {
        Pointers<Object> f = first;
        Pointers<Object> newPointers = new Pointers<>(e, f, null);
        first = newPointers;
        if (f == null){ last = newPointers;}
        else {f.previous = newPointers;}
        size++;
    }

    @Override
    public void addLast(Object e) {
        Pointers<Object> l = last;
        Pointers<Object> newPointers = new Pointers<>(e, null, last);
        last = newPointers;
        if (l == null){ first = newPointers;}
        else {l.next = newPointers;}
        size++;
    }

    @Override
    public boolean offerFirst(Object o) {
        return false;
    }

    @Override
    public boolean offerLast(Object o) {
        return false;
    }

    @Override
    public Object removeFirst() {
        first.previous = null;
        first.next = null;
        return first;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object pollFirst() {
        return null;
    }

    @Override
    public Object pollLast() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    public Object getFirst() { return first.element; }

    public void setFirst(Pointers<Object> first) { this.first = first; }

    public Object getLast() {
        return last.element;
    }

    public void setLast(Pointers<Object> last) { this.last = last; }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public Iterator descendingIterator() {
        return null;
    }

    @Override
    public Object peekFirst() {
        return null;
    }

    @Override
    public Object peekLast() {
        return null;
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
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public void push(Object o) {

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

}

