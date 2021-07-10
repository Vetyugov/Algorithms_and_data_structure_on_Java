package lesson4;

import lesson3.MyStack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1 Задание. Реализовать класс Stack используя класс MyLinkedList
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        System.out.println("Размер: "+myStack.size());

        int size = myStack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(myStack.pop());
        }


        //2 Задание. Добавить итератор для класса MyLinkedList

        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(6);
        mll.insertFirst(2);
        mll.insertFirst(8);

        System.out.println("Вывод с помощью sout:");
        System.out.println(mll);

        System.out.println("Вывод с помощью Итератора (способ 1):");
        Iterator<Integer> iterator = mll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Вывод с помощью Итератора (способ 2):");
        for (Integer x : mll) {
            System.out.println(x);
        }






//
//        System.out.println(mll);
//
//        mll.insertLast(77);
//        mll.insertLast(88);
//        System.out.println(mll);

//        System.out.println(mll.removeFirst());
//        System.out.println(mll.removeLast());
//        System.out.println(mll);

//        System.out.println(mll.removeFirst());
//        System.out.println(mll);

//        System.out.println(mll.indexOf(8));

//        mll.insert(2, 55);
//        System.out.println(mll);
//
//        System.out.println(mll.remove(55));
//        System.out.println(mll);

//        MyLinkedQueue<Integer> queue = new MyLinkedQueue<>();
//        queue.add(5);
//        queue.add(7);
//        queue.add(3);
//        queue.add(8);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(queue.remove());
//        }



//        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 3, 2, 4, 5, 6, 3, 2, 6, 5, 43, 23));
//        System.out.println(list);
//        list.removeIf(x -> x % 2 == 0);
//        System.out.println(list);


    }
}
