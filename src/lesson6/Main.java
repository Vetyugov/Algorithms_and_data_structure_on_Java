package lesson6;

import java.util.Random;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        //Для проверки если нарисовать,
        //тут высота - 5,
        //количество несбаллансированных - 3
        //размер - 10
        System.out.println("-- ДЛЯ ПРОВЕРКИ --");
        map.put(5, "five");
        map.put(3, "three");
        map.put(9, "nine");
        map.put(4, "four");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(14, "fourteen");

        int notBalanced = map.countNotBalanced();
        System.out.println("Количество несбалланчированных деревьев: " + notBalanced);
        int totalSize = map.size();
        System.out.println("Размер всего дерева: " + totalSize);

        System.out.println();
        //Заполним наше дерево

        MyTreeMap<Integer, String> map1 = new MyTreeMap<>();
        for (int i = 0; i < 200_000; i++) {
            map1.put((int)(Math.random()*200_000 - 100_000), "i");
        }

        System.out.println("-----Для нашей структуры-----");
        notBalanced = map1.countNotBalanced();
        System.out.println("Количество несбалланчированных деревьев: " + notBalanced);
        totalSize = map1.size();
        System.out.println("Размер всего дерева: " + totalSize);
        double count = ((double) notBalanced/totalSize)*100;
        System.out.println("Процент несбалансированных деревьев: " + count + "%" );


    }
}
