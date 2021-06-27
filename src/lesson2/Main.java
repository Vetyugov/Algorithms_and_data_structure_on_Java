package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        MyArrayList<Integer> mal = new MyArrayList<>();
//
//        mal.add(4);
//        mal.add(7);
//        mal.add(2);
//        mal.add(9);
//
//        System.out.println(mal);
//
//        mal.add(1, 99);
//        System.out.println(mal);

//        mal.remove(0);
//        System.out.println(mal);

//        System.out.println(mal.indexOf(9999));

//        mal.remove((Integer) 2);
//        System.out.println(mal);


//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(3);
//        msal.add(8);
//        msal.add(2);
//        msal.add(9);
//
//        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(9));


        //Создаём массив из random элементов размером 100_000;
        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            mal.add(random.nextInt(20));
        }

        //Засекаем время выполнения сортировки пузырьком
        long currentTime = System.currentTimeMillis();
        mal.bubbleSort();
        System.out.println("Сортировка пузырьком прошла за время = " + (System.currentTimeMillis() - currentTime));

        //Создаём новый массив из random элементов размером 100_000;
        mal = new MyArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            mal.add(random.nextInt(20));
        }

        //Засекаем время выполнения сортировки методом вставками
        currentTime = System.currentTimeMillis();
        mal.insertionSort();
        System.out.println("Сортировка методом вставки прошла за время = " + (System.currentTimeMillis() - currentTime));

        //Создаём новый массив из random элементов размером 100_000;
        mal = new MyArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            mal.add(random.nextInt(20));
        }

        //Засекаем время выполнения сортировки методом выбора
        currentTime = System.currentTimeMillis();
        mal.selectionSort();
        System.out.println("Сортировка методом выбора прошла за время = " + (System.currentTimeMillis() - currentTime));


//        mal.selectionSort();
//        mal.insertionSort();
//        mal.bubbleSort();

//        System.out.println(mal);

    }
}
