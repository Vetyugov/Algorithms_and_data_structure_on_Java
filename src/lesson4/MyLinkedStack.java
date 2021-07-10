package lesson4;

import java.util.EmptyStackException;

public class MyLinkedStack <T>{

    private MyLinkedList<T> list;

    public MyLinkedStack() {
        list = new MyLinkedList<>();
    }

    /**
     *Добавить элемент сверху
     */
    public void push(T item) {
        list.insertLast(item);
    }

    /**
     *Взять последний элемент без удаления
     */
    public T peek() {
        return list.getLast();
    }

    /**
     *Взять последний элемент с удалением
     */
    public T pop() {
        return list.removeLast();
    }

    /**
     *Вернуть размер stack
     */
    public int size() {
        return list.size();
    }

}
