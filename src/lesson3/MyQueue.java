package lesson3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyQueue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;
    private int prevCap;

    //0 1 2 3 4
    //  b
    //    e
    //  7

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(T item) {
        if (isFull()) {
            expand();
            if (end-1 < begin){
                int mover = prevCap;
                for (int i = 0; i < end; i++) {
                    list[mover] = list[i];
                    list[i] = null;
                    mover++;
                }
                end = mover;
            }
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T remove() {
        T temp = peek();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[begin];
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


    /**
     *Увеличение размера массива в 1,5 раза +1
     */
    private void expand(){
        prevCap = list.length;
        T[] temp = (T[]) new Object[list.length+list.length/2 +1];
        for (int i = 0; i < size; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }
}
