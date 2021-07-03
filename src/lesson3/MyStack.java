package lesson3;

import java.util.EmptyStackException;

public class MyStack<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 5;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyStack() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    /**
     *Добавить элемент сверху
     */
    public void push(T item) {
        if (isFull()) {
            expand();
        }
        list[size] = item;
        size++;
    }

    /**
     *Взять последний элемент с удалением
     */
    public T pop() {
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    /**
     *Взять последний элемент без удаления
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
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

    private void reCapacity(int newCapacity) {
        T[] tempArr = (T[]) new Object[newCapacity];
        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
    }

    /**
     *Увеличение размера массива в 1,5 раза +1
     */
    private void expand(){
        T[] temp = (T[]) new Object[list.length+list.length/2 +1];
        for (int i = 0; i < size; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }
}
