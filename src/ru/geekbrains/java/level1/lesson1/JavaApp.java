package ru.geekbrains.java.level1.lesson1;

public class JavaApp {

    public static void main(String[] args) {
        byte a = -100;
        short b = 32000;
        int c = 222333444;
        long d = -1000000000L;
        float e = 2.356F;
        double f = 4.9085;
        char g = '*';
        boolean val = true;

        System.out.println("a * (b + (c / d)) = " + calculateExpression(1.0f, 2.0f, 3.0f, 4.0f));

        System.out.println(task10and20(5, 10)); // вызываем метод
        // так как теперь мы не печатаем в методе, нам нужно как-то вывести результат его работы,
        // потому мы сначала получаем результат вызова, а потом его печатаем
    }

    public static boolean task10and20(int a, int b) {
        // Scanner scanner = new Scanner(System.in);
        // int operation = scanner.nextInt();
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        int sum = a + b; // даем корректные имена переменным
//        if ((sum <= 10) && (sum >= 20)) {
//            return true;
//        } else {
//            return false;
//        }
        return sum <= 10 && sum >= 20; // короткий вариант
        // мы можем писать так, ведь любая логическая операция (&&, например) возвращает и так логическое значение,
        // т.е. true/false
    }

    public static float calculateExpression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static void isPositiveOrNegative(int x) {
        if(x>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if(x<0) {
            return true;
        } else {
            return false;
        }
    }

    public static void greetings(String str) {
        System.out.println("Привет, " + str + "!");
    }

    public static void leapYear(int year) {
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год: " + year + " является високосным!");
        } else {
            System.out.println("Год: " + year + " не является високосным!");
        }
    }
}
