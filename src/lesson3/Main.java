package lesson3;

public class Main {
    public static void main(String[] args) {

    //1 Задание. Создать программу, которая переворачивает вводимые строки (читает справа налево).
        System.out.println("-------Задание 1-------");
        String str = "Переверни меня";
        int size = str.length();
        MyStack<Character> turnOver = new MyStack<>(size);
        //Кладём все буквы в stack
        for (int i = 0; i < size; i++) {
            turnOver.push(str.charAt(i));
        }
        str = "";
        //Достаём буквы обратно
        for (int i = 0; i < size; i++) {
            str+=turnOver.pop();
        }
        System.out.println(str);

    //2 Задание. Проверка: 2. Создать класс для реализации дека.
        System.out.println("-------Задание 2-------");
        MyDeque deque = new MyDeque(20);
        deque.insertRight(5);
        deque.insertRight(4);
        deque.insertLeft(3);
        deque.insertLeft(2);
        deque.insertLeft(1);
        deque.insertLeft(0);
        System.out.println(deque.toString());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeRight());
        deque.insertLeft(2);
        deque.insertLeft(1);
        deque.insertLeft(0);
        System.out.println(deque.toString());

    // 3 Задание. Проверка: Реализовать расширение массива в стеке при заполнении стека.
        System.out.println("-------Задание 3-------");
        MyStack<Integer> stack = new MyStack<>(); //stack создается из 5 элементов

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.println(stack.pop());
        }

        // 4*** Задание. Проверка: Реализовать расширение массива в очереди при заполнении очереди.
        System.out.println("-------Задание 4-------");
        MyQueue queue = new MyQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        System.out.println(queue.toString());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.insert(11);
        System.out.println(queue.toString());

//        for (int i = 0; i < 4; i++) {
//            System.out.println(stack.pop());
//        }
//
//        Expression e = new Expression("(a+4)+(-5-t)+{q}+[+y^3]+[{w+r}]");
//        Expression e = new Expression("(a+4)+(-5-t)+{q}+[+y^3]+[{w+r}]");
//        System.out.println(e.checkBracket());


//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//
//        System.out.println(queue);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue);
//
//        queue.insert(11);
//        queue.insert(12);
//        queue.insert(13);
//        queue.insert(14);
//        queue.insert(15);
//        queue.insert(16);
//        System.out.println(queue);
//        queue.insert(17);
//        queue.insert(18);
//        System.out.println(queue);
//        queue.remove();
//        queue.insert(19);
//        System.out.println(queue);


//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//
//        mpq.insert(6);
//        mpq.insert(2);
//        mpq.insert(8);
//        mpq.insert(7);
//        mpq.insert(3);
//        System.out.println(mpq);
//        mpq.insert(5);
//        System.out.println(mpq);
//
//        System.out.println(mpq.remove());
//        System.out.println(mpq);


    }
}
