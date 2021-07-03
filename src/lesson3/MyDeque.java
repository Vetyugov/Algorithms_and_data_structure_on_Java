package lesson3;

import java.util.Arrays;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //  b
    //    e
    //  7

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void  insertRight(T item) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void  insertLeft(T item) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        size++;
        begin = previousIndex(begin);
        list[begin] = item;
    }

    public T removeLeft() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        T temp = list[begin];
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeRight() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        end = previousIndex(end);
        T temp = list[end];
        size--;
        list[end] = null;
        return temp;
    }

    private int previousIndex(int index) {
        if (index ==0){
            return list.length-1;
        }
        return (index - 1);
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " b = " + begin + " e = " + end;
    }

}
