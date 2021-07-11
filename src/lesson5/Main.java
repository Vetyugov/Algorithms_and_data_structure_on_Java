package lesson5;

public class Main {
    public static void main(String[] args) {

        //Задание 1. Написать программу по возведению числа в степень с помощью рекурсии.
        //Работает для отрицательного основания, отрицательной степени и с вещественными числами
        System.out.println("----------ЗАДАЧА 1----------");
        System.out.println(inPower(2, 4));
        System.out.println(inPower(-2, -3));
        System.out.println(inPower(-0.5, -3));

        //Задание 2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
        System.out.println("----------ЗАДАЧА 2----------");
        int [] mass = { 5, 4, 7, 1, 1};//Массив масс элементов
        int [] value = {3, 2, 4, 7, 1};//Массив ценностей элементов
        int weight = 12; //Максимальная вместимость рюкзака
        KnapsackProblem problem = new KnapsackProblem(mass, value, weight);
        problem.solve();





//        System.out.println(fact(5));
//        System.out.println(recFact(5));

//        System.out.println(fibo(47));
//        System.out.println(recFibo(10));

//        System.out.println(triangleNum(15));
//        System.out.println(recTriangleNum(15));

//        System.out.println(multiply(3, 8));
//        System.out.println(recMultiply(3, 8));

//        System.out.println(sumDigit(37512));
//        System.out.println(recSumDigit(37512));


    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int recFact(int n) {
        if (n == 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }

    public static long fibo(long n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    public static long recFibo(long n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    public static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    public static int multiply(int a, int b) {
        int p = 0;
        for (int i = 0; i < b; i++) {
            p += a;
        }
        return p;
    }

    public static int recMultiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return recMultiply(a, b - 1) + a;
    }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int recSumDigit(int n) {
        if (n < 10) {
            return n;
        }
        return recSumDigit(n / 10) + n % 10;
    }

    public static double inPower(double base, int power){
        if (power == 0) {
            return 1;
        }else if (power < 0){
            return inPower(base, power+1)*(1/base);
        } else {
            return inPower(base, power-1)*base;
        }
    }


}
